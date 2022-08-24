# Definicao de simbolos utilizada pelo compilador de IsiLang



class IsiSymbol:
    
    def __init__(self, nome):
        self.name: str = nome

    def getName(self):
        return str(self.name)

    def setName(self, newname):
        self.name = str(newname)

    def __str__(self):
        return f"IsiSymbol [name = {self.name} ]"

    def generatePythonCode(self):
        pass