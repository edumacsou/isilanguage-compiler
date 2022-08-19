# Definicao da classe que ira representar o programa em memoria

from isiSymbolTable import IsiSymbolTable


class AbstractCommand():
    
    def generatePythonCode():
        pass


class ReadCommand(AbstractCommand):

    def __init__(self, id: str):
        self._identificador = id

    def __str__(self):
        return "Read Command[value = {}]\n".format(self._identificador)


class WriteCommand(AbstractCommand):

    def __init__(self, id: str):
        self._identificador = id

    def __str__(self):
        return "Write Command[value = {}]\n".format(self._identificador)


class AttribCommand(AbstractCommand):

    def __init__(self, id: str, expr):
        self._identificador = id
        self._expr = expr

    def __str__(self):
        return "Attribuition Command[id = {}, expr = {}]\n".format(self._identificador, self._expr)


class DecisionCommand(AbstractCommand):

    def __init__(self, condition : str, tlist, flist):
        self._condition = condition
        self._trueList  = tlist
        self._falseList = flist 

    def __str__(self):
        tlistText = [x.__str__() for x in self._trueList]
        flistText = [x.__str__() for x in self._falseList]
        return "Decision Command[ condition = {}\n\ntrueList = {}\nfalseList = {}]\n".format(self._condition, "".join(tlistText), "".join(flistText))


class WhileCommand(AbstractCommand):

    def __init__(self, condition : str, clist):
        self._condition = condition
        self._cmdList  = clist
        

    def __str__(self):
        clistText = [x.__str__() for x in self._cmdList]
        
        return "While Command[ condition = {}\n\nCommands List:\n{}\n]".format(self._condition, "".join(clistText))



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

    def generateTarget():
        pass