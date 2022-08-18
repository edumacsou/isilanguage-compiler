from antlr4 import *
import os
ROOT_PATH = os.path.normpath(os.path.join(os.path.dirname(__file__), '../../'))
import sys
sys.path.append(ROOT_PATH)
from src.parser.IsiLangLexer import IsiLangLexer     
from src.parser.IsiLangParser import IsiLangParser  


def main():
    input_txt = FileStream(f'{ROOT_PATH}/input.txt')
    lexer = IsiLangLexer(input_txt)
    stream = CommonTokenStream(lexer)
    parser = IsiLangParser(stream)
    tree = parser.prog()
    print(tree.toStringTree(recog=parser))

    print(parser._isiProgram)


if __name__ == '__main__':
    main()
