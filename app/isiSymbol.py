# Definicao de simbolos utilizada pelo compilador de IsiLang



class IsiSymbol:
    
    def __init__(self, nome):
        self.name = nome

    def getName(self):
        self.name

    def setName(self, newname):
        self.name = newname

    def __str__(self):
        return f"IsiSymbol [name = {self.name} ]"

