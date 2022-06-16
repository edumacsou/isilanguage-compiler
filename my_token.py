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
        return self.pos == len(self.content)

class Token():
    tk_text = ''
    tk_type = ''
    def set_text(self, text):
        self.tk_text = text
    def set_type(self, type_txt):
        self.tk_type = type_txt
    def get_text(self):
        return self.tk_text

    def get_type(self):
        return self.tk_type

    def __str__(self):
        return f'[Token Type = {tk_type}, Text = {tk.text}]'
