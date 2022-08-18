# definicao da hashtable de simbolos, ou dict, para isilang compiler

import isiSymbol
from isiVariable import IsiVariable

class IsiSymbolTable:

    def __init__(self):
        self.map = {}

    def add(self, symbol: IsiVariable):
        self.map[symbol.getName()] = symbol
    
    def exists(self, symbolname: str):
        return symbolname in self.map.keys()

    def get(self, keyname: str):
        #return self.map.get(keyname)
        try:
            return self.map[keyname]
        except:
            return None

    def print(self):
        for k in self.map.keys():
            print("Dict[{}] = {}".format(k, self.map[k]))

    