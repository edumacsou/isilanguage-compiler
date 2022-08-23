from isiSymbol import IsiSymbol


class IsiVariable(IsiSymbol):

    NUMBER = 0
    TEXT = 1
    BOOL = 2

    def __init__(self, name: str, type, value, used):
        super().setName(name)
        self.type = type
        self.value = value
        self.used = False

        if (self.type == IsiVariable.BOOL):
            if(value == "verdadeiro"):
                self.value = True
            else:
                self.value = False

    def getType(self):
        return self.type

    def getTypeStr(self):
        tipos = ["NUMBER", "TEXT", "BOOL"]
        return tipos[self.getType()]

    def setType(self, type):
        self.type = type

    def getValue(self):
        return self.value

    def setValue(self, value):
        self.value = value

    def setUsed(self, used):
        self.used = used

    def getUsed(self):
        return self.used

    def __str__(self):
        return "IsiVariable [name = {}, type = {}, value = {}, used = {}]".format(self.name, self.type, self.value, self.used)


    # avaliar se isso faz sentido, dado que em python nao declaramos tipos?
    def generatePythonCode(self, fIndent=""):
        
        # deixando apenas como comentario, porque em python nao temos um trecho especifico para declarar
        # variaveis, muito menos seus tipos

        # avaliar deixar como type hint qndo possivel?
        if (self.type == self.NUMBER):
            str = "#double"
        else:
            str = "#String"

        return fIndent + str + " " + self.name + ";\n"

    def generateCCode(self, fIndent=""):

        append = ""

        if (self.type == self.NUMBER):
            str = "float"
        elif ((self.type == self.BOOL)):
            str = "int"
        else:
            str = "char"
            append = "[1000]"

        

        return fIndent + str + " " + self.name + append + ";\n"
