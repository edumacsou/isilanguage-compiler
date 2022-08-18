# definicao da hashtable de simbolos, ou dict, para isilang compiler

import isiSymbol
from isiVariable import IsiVariable

class IsiSymbolTable:

    def __init__(self):
        self._hashTable = {}

    def add(self, symbol: IsiVariable):
        self._hashTable[symbol.getName()] = symbol
    
    def exists(self, symbolname: str):
        #return symbolname in self._hashTable.keys()
        return (self._hashTable.get(symbolname, None) != None)

#    def get(self, keyname: str):
#        #return self._hashTable.get(keyname)
#        try:
#            return self._hashTable[keyname]
#        except:
#            return None

    def __str__(self):
        text=[]
        for k in self._hashTable.keys():
            text.append("Dict[{}] = {}\n".format(k, self._hashTable[k]))
        return "".join(text)

    
