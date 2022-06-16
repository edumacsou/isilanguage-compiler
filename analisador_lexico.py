# /bin/base python analisador_lexico.py

from my_token import *

def main():
    file = IsiScanner('input.isi')
    print(file.content)
    print(file.current_char)
    file.next_char()
    print(file.current_char)
    file.next_char()
    print(file.current_char)
    file.back()
    print(file.current_char)

if __name__ == '__main__':
    main()
