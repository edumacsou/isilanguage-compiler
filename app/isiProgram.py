# Definicao da classe que ira representar o programa em memoria

from token import NUMBER
from isiVariable import IsiVariable
from isiSymbolTable import IsiSymbolTable
import os

class AbstractCommand():
    
    def generatePythonCode(self, fIndent=""):
        pass


class ReadCommand(AbstractCommand):

    def __init__(self, id: str, var: IsiVariable):
        self._identificador = id
        self._var = var   # util para gerar codigo em C / Java, ja que sera necessario definir tipo de read

    def __str__(self):
        return "Read Command[value = {}]\n".format(self._identificador)

    def generatePythonCode(self, fIndent=""):
        
        if (self._var.getType() == IsiVariable.NUMBER):
            return fIndent + "{} = float(input())\n".format(self._identificador)
        elif (self._var.getType() == IsiVariable.BOOL):
            return fIndent + "{} = bool(input())\n".format(self._identificador)
        else:
            return fIndent + "{} = input()\n".format(self._identificador)

    def generateCCode(self, fIndent=""):
        if (self._var.getType() == IsiVariable.NUMBER):
            return fIndent + "scanf(\"%f\", &{});\n".format(self._identificador)
        elif (self._var.getType() == IsiVariable.BOOL):
            return fIndent + "scanf(\"%d\", &{});\n".format(self._identificador)  # ler como int, pois C na otem booleano!
        else:
            return fIndent + "scanf(\"%s\", &{});\n".format(self._identificador)  # avaliar necessidade do operador & 
        

class WriteCommand(AbstractCommand):

    def __init__(self, id: str, type=None):
        self._identificador = id
        self._type = type

    def __str__(self):
        return "Write Command[value = {}]\n".format(self._identificador)

    def generatePythonCode(self, fIndent=""):

        return fIndent + "print({})\n".format(self._identificador)

    def generateCCode(self, fIndent=""):
        if (self._type == IsiVariable.NUMBER):
            #print("transpilando escrita de numero para C")
            return fIndent + "printf(\"%f\", {});\n".format(self._identificador)
        elif (self._type == IsiVariable.BOOL):
            #print("transpilando escrita de bool para C")
            return fIndent + "printf(\"%d\", {});\n".format(self._identificador)  # imprimir como int, pois C na otem booleano!
        else:
            #print("transpilando escrita de string para C")
            return fIndent + "printf({});\n".format(self._identificador)
    


class AttribCommand(AbstractCommand):

    def __init__(self, id: str, expr):
        self._identificador = id
        self._expr = expr

        if(expr == "verdadeiro"):
            self._expr = "True"
        if(expr == "falso"):
            self._expr = "False"

    def __str__(self):
        return "Attribuition Command[id = {}, expr = {}]\n".format(self._identificador, self._expr)

    def generatePythonCode(self, fIndent=""):

        return fIndent + self._identificador + " = " + self._expr + "\n"

    def generateCCode(self, fIndent=""):
        exprClean = str(self._expr)

        if(exprClean.find("%") > -1):
            return fIndent + self._identificador + " = " + "(int){}%(int){};\n".format(exprClean.split("%")[0], exprClean.split("%")[1])
        elif(exprClean.find("**") > -1):
            return fIndent + self._identificador + " = " + "pow({}, {});\n".format(exprClean.split("**")[0], exprClean.split("**")[1])
        elif(exprClean.find("\"") > -1):  # atrib de strings, precisamos adaptar o uso de strcopy em C
            return fIndent + "strcpy({}, {});\n".format(self._identificador, exprClean)
        else:
            return fIndent + self._identificador + " = " + exprClean + ";\n"


class DecisionCommand(AbstractCommand):

    def __init__(self, condition : str, tlist, flist):
        self._condition = condition
        self._trueList  = tlist
        self._falseList = flist

        self._condition = self._condition.replace('verdadeiro', 'True')
        self._condition = self._condition.replace('falso', 'False') 

    def __str__(self):
        tlistText = [x.__str__() for x in self._trueList]
        flistText = [x.__str__() for x in self._falseList]
        return "Decision Command[ condition = {}\n\ntrueList = {}\nfalseList = {}]\n".format(self._condition, "".join(tlistText), "".join(flistText))


    def generatePythonCode(self, fIndent=""):

        decisiontxt = []
        indent = "    "

        decisiontxt.append("{}if({}):\n".format(fIndent, self._condition))
        #print("len de fIndent no if ({})= {}".format(self._condition, len(fIndent)))
        for x in self._trueList:
            #decisiontxt.append(fIndent + indent + x.generatePythonCode())
            decisiontxt.append(x.generatePythonCode(fIndent + indent))

        
        if(len(self._falseList ) != 0):
            #print("len de fIndent no else ({})= {}".format(self._condition, len(fIndent)))
            decisiontxt.append("{}else:\n".format(fIndent))
            for x in self._falseList:
                #decisiontxt.append(fIndent + indent + x.generatePythonCode())
                decisiontxt.append(x.generatePythonCode(fIndent + indent))

        return "".join(decisiontxt)

    def generateCCode(self, fIndent=""):
        
        decisiontxt = []
        indent = "    "

        decisiontxt.append("{}if({}){{\n".format(fIndent, self._condition))
        #print("len de fIndent no if ({})= {}".format(self._condition, len(fIndent)))
        for x in self._trueList:
            #decisiontxt.append(fIndent + indent + x.generatePythonCode())
            decisiontxt.append(x.generateCCode(fIndent + indent))

        
        if(len(self._falseList ) != 0):
            #print("len de fIndent no else ({})= {}".format(self._condition, len(fIndent)))
            decisiontxt.append("{}}}else{{\n".format(fIndent))
            for x in self._falseList:
                #decisiontxt.append(fIndent + indent + x.generatePythonCode())
                decisiontxt.append(x.generateCCode(fIndent + indent))

        decisiontxt.append("{}}}\n".format(fIndent))

        return "".join(decisiontxt)


class WhileCommand(AbstractCommand):

    def __init__(self, condition : str, clist):
        self._condition = condition
        self._cmdList  = clist
        

    def __str__(self):
        clistText = [x.__str__() for x in self._cmdList]
        
        return "While Command[ condition = {}\n\nCommands List:\n{}\n]".format(self._condition, "".join(clistText))

    def generatePythonCode(self, fIndent=""):
        
        whiletxt = []

        indent = "   "

        whiletxt.append("{}while({}):\n".format(fIndent, self._condition))

        for x in self._cmdList:
            #whiletxt.append(fIndent + indent + x.generatePythonCode())
            whiletxt.append(x.generatePythonCode(fIndent + indent))

        return "".join(whiletxt)


    def generateCCode(self, fIndent=""):

        whiletxt = []

        indent = "   "

        whiletxt.append("{}while({}){{\n".format(fIndent, self._condition))

        for x in self._cmdList:
            #whiletxt.append(fIndent + indent + x.generatePythonCode())
            whiletxt.append(x.generateCCode(fIndent + indent))

        whiletxt.append("{}}}\n".format(fIndent))

        return "".join(whiletxt)

        

class IsiProgram():

    def __init__(self):
        self._varTable                  = IsiSymbolTable()
        self._comandos: AbstractCommand = []
        self._name                      = None


    def getVarTable(self):
        return self._varTable

    def setVarTable(self, vt: IsiSymbolTable):
        self._varTable = vt

    def getCommands(self):
        return self._comandos

    def setCommands(self, cmds):
        self._comandos = cmds

    def getProgramName(self):
        return self._name

    def setProgramName(self, name: str):
        self._name = name


    def __str__(self):
        programa = []
        for x in self._comandos:
            programa.append("Comando = {}\n".format(x))
        return "".join(programa)

    def generatePyTarget(self, outputname="stdOutput.py"):

        codigoTranspilado = []
        # para indentar corretamente o codigo
        indent = "    "

        codigoTranspilado.append("def main():\n\n")

        # talvez precise passar a indentacao para o generate...
        for x in self._varTable._hashTable.values():
            codigoTranspilado.append( x.generatePythonCode(indent))

        for y in self._comandos:
            codigoTranspilado.append( y.generatePythonCode(indent))

        codigoTranspilado.append("\nif __name__ == \"__main__\":\n")
        codigoTranspilado.append("    main()\n\n")

        resultado = "".join(codigoTranspilado)

        # cria arquivo com o codigo final
        filename = "results/" + outputname

        print("Resultado salvo em: {}".format(filename))
        os.makedirs(os.path.dirname(filename), exist_ok=True)

        with open(filename, "w") as f:
            f.write(resultado)

        return resultado

    def generateCTarget(self, outputname="stdOutput.c"):

        codigoTranspilado = []
        # para indentar corretamente o codigo            
        indent = "    "

        codigoTranspilado.append("#include <stdio.h>\n")
        codigoTranspilado.append("#include <math.h>\n")
        codigoTranspilado.append("#include <string.h>\n\n")
        codigoTranspilado.append("int main(){\n\n")

        codigoTranspilado.append(indent + "int True = 1;\n")
        codigoTranspilado.append(indent + "int False = 1;\n\n")

        print("imprimindo tabela de variaveis {}:".format(self._varTable._hashTable))
        for x in self._varTable._hashTable.values():
            print(x)

        # talvez precise passar a indentacao para o generate...
        for x in self._varTable._hashTable.values():
            codigoTranspilado.append( x.generateCCode(indent))

        for y in self._comandos:
            codigoTranspilado.append( y.generateCCode(indent))

        
        codigoTranspilado.append("\n\n    return 0;\n\n")
        codigoTranspilado.append("}\n")


        resultado = "".join(codigoTranspilado)

        # cria arquivo com o codigo final
        filename = "results/" + outputname

        print("Resultado salvo em: {}".format(filename))
        os.makedirs(os.path.dirname(filename), exist_ok=True)

        with open(filename, "w") as f:
            f.write(resultado)

        return resultado

