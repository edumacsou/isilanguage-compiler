from isiSymbol import IsiSymbol


class IsiVariable(IsiSymbol):

    NUMBER = 0
    TEXT = 1

    def __init__(self, name: str, type, value, used):
        super().setName(name)
        self.type = type
        self.value = value
        self.used = False

    def getType(self):
        return self.type

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
    def generatePythonCode(self):
        

        if (self.type == self.NUMBER):
            str = "double"
        else:
            str = "String"

        return str + " " + self.name
