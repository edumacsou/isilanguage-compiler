# Definicao da classe que ira representar o programa em memoria

from isiSymbolTable import IsiSymbolTable


class AbstractCommand():
    
    def generatePythonCode():
        pass


class ReadCommand(AbstractCommand):

    def __init__(self, id: str):
        self._identificador = id


class WriteCommand(AbstractCommand):

    def __init__(self, id: str):
        self._identificador = id


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



    def generateTarget():
        pass