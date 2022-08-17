import isiSymbol


class IsiVariable(isiSymbol.IsiSymbol):

    NUMBER = 0
    TEXT = 1

    def __init__(self, name, type, value):
        super().setName(name)
        self.type = type
        self.value = value

    def getType(self):
        self.type

    def setType(self, type):
        self.type = type

    def getValue(self):
        self.value

    def setValue(self, value):
        self.value = value

    def toString(self):
        return "IsiVariable [name = {}, type = {}, value = {}]".format(self.name, self.type, self.value)


    # avaliar se isso faz sentido, dado que em python nao declaramos tipos?
    def generatePythonCode(self):
        

        if (self.type == self.NUMBER):
            str = "double"
        else:
            str = "String"

        return str + " " + self.name

