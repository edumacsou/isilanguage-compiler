from antlr4 import *
from src.parser.IsiLangLexer import IsiLangLexer
from src.parser.IsiLangParser import IsiLangParser


def main():
    input_txt = FileStream('../../input.txt')
    lexer = IsiLangLexer(input_txt)
    stream = CommonTokenStream(lexer)
    parser = IsiLangParser(stream)
    tree = parser.prog()
    print(tree.toStringTree(recog=parser))


if __name__ == '__main__':
    main()
