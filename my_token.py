# /bin/bash python token.py

import traceback
import os
import sys

digits = [x for x in '0123456789']
low_keys = [x for x in 'abcdefghijklmnopqrstuvwxyz']
up_keys = [x for x in 'ABCDEFGHIJKLMNOPQRSTUVWXYZ']
valid_symbols = [x for x in "+-*/(){}'.<>:="]
reservadas = {
    "programa"  : '',
    "fimprog"  : '',
    "declare"   : '',
    "leia"      : '',
    "escreva"   : '',
    "se"        : '',
    "entao"     : '',
    "senao"     : '',
}

TK_IDENTIFIER    = 0
TK_NUMBER        = 1
TK_OPERATOR      = 2
TK_PONCTUATION   = 3    # Tk terminador de linha (' . ')
TK_ASSIGN        = 4    # Tk operador de atribuiçao :=
TK_TEXT          = 5
TK_NUMBER_INT    = 6
TK_NUMBER_DOUBLE = 7
TK_SEPARATOR     = 8    # Tk de virgula
TK_OPAR          = 9    # Tk abre parenteses
TK_CPAR          = 10   # Tk fecha parenteses
TK_RESERVED_ID   = 11   # Tk identificadores reservados  
TK_OKEY          = 12   # Tk abre chaves
TK_CKEY          = 13   # Tk fecha chaves
TK_ADD_OP        = 14
TK_MINUS_OP      = 15
TK_MUL_OP        = 16
TK_DIV_OP        = 17



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

def is_dot_operator(symbol):
    return symbol == '.'

def is_separator(symbol):
    return symbol == ','

def is_opar(symbol):
    return symbol == '('

def is_cpar(symbol):
    return symbol == ')'

def is_okey(symbol):
    return symbol == '{'

def is_ckey(symbol):
    return symbol == '}'

def is_add_op(symbol):
    return symbol == '+'

def is_minus_op(symbol):
    return symbol == '-'

def is_mul_op(symbol):
    return symbol == '*'

def is_div_op(symbol):
    return symbol == '/'

def is_reserved(symbol):

    try:
        check = reservadas[symbol]
    except KeyError:
        check = None

    return check is not None

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
