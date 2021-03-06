# /bin/bash python token.py

import traceback
import os
import sys

digits = list(range(0,10))
low_keys = [x for x in 'abcdefghijklmnopqrstuvwxyz']
up_keys = [x for x in 'ABCDEFGHIJKLMNOPQRSTUVWXYZ']
valid_symbols = [x for x in "+-*/(){}'.,"]
reservadas = {
    "programa"  : '',
    "fimprog."  : '',
    "declare"   : '',
    "leia"      : '',
    "escreva"   : '',
    "se"        : '',
    "entao"     : '',
    "senao"     : '',
}

TK_IDENTIFIER   = 0
TK_NUMBER       = 1
TK_OPERATOR     = 2
TK_PONCTUATION  = 3
TK_ASSIGN       = 4
TK_TEXT         = 5

def is_digit(symbol):
    return symbol in digits

def is_lower(symbol):
    return symbol in low_keys

def is_upper(symbol):
    return symbol in up_keys

def is_letter(symbol):
    return is_lower(symbol) or is_upper(symbol)

def is_symbol(symbol):
    return symbol in valid_symbols

def is_space(symbol):
    return symbol in [' ', '\t', '\n', '\r']

def is_operator(symbol):
    return symbol in ['<', '>', '=', '!', ':']

def is_valid(symbol):
    return is_letter(symbol) or is_digit(symbol) or is_symbol(symbol) or is_operator(symbol) or symbol == ' '

class IsiScanner():
    '''
    A classe IsiScanner faz o trabalho de navegador do arquivo.
    Ela implementa as funções para ler um próximo caracter, voltar um caracter e identificar o fim do arquivo
    '''
    ### !!!!!! Aparentemente é melhor colocar as funções do tipo is_**** para o Scanner, assim as chamadas do tipo:
    ### if is_digit(file.current_char) podem ser substituidas por: if file.is_digit()
    def __init__(self, filename):
        self.pos = 0
        try:
            with open('/'.join([os.getcwd(), filename]), 'r') as file:
                self.content = file.read()
        except Exception as e:
            print(traceback.format_exc())
            exit(1)
        self.current_char = self.content[self.pos]

    def next_char(self):
        self.pos += 1
        self.current_char = self.content[self.pos]

    def back(self):
        self.pos -= 1
        self.current_char = self.content[self.pos]

    def is_EOF(self):
        return self.pos == len(self.content)-1

    def __str__(self):
        return self.content

class Token():
    '''
    A classe Token  define os Tokens, que devem possuir um tipo (atribuído ao final de sua leitura) e um Texto (que é incrementado durante sua leitura)
    A classe implementa os métodos que possibilitam a definição do tipo e do texto do token e a adição de um novo caracter ao Token.
    '''
    tk_text = ''
    tk_type = ''
    def set_text(self, text):
        self.tk_text = text
    def set_type(self, type_txt):
        self.tk_type = type_txt
    def get_text(self):
        return self.tk_text

    def append_char(self, char):
        self.tk_text = self.tk_text + char

    def get_type(self):
        return self.tk_type

    def __str__(self):
        return f'[Token Type = {self.tk_type}, Text = {self.tk_text}]'
