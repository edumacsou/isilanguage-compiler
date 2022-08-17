# definicao da hashtable de simbolos, ou dict, para isilang compiler

import isiSymbol


class IsiSymbolTable:

    def __init__(self):
        self.map = dict()

    def add(self, symbol: isiSymbol):
        self.map[symbol.getName()] = symbol
    
    def exists(self, symbol: isiSymbol):
        return self.map.get(symbol.getName(), None) != None

    def get(self, keyname):
        return self.map.get(keyname)

    