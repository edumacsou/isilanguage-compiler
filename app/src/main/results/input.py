def main():

    x = True
    print("Escreva o numero a:\n")
    a = float(input())
    print("Escreva o numero b")
    b = float(input())
    print("Escreva o numero d")
    d = float(input())
    d = d**2
    print("d ao quadrado:")
    print(d)
    d = d%3
    print("d resto da divisao por 3:")
    print(d)
    t1 = "Meu Teste"
    a = 1+2*a
    c = 5.755
    print(t1)
    print("Ola Mundo")
    if(x==True):
        print(t1)
        if(a<c):
            print("a menor que c!")
        else:
            print("c maior igual a A....")
    if(a>b):
        print(a)
    else:
        print(b)
    while(a<b):
       a = a+1
       print(a)
       if(a>c):
           print(t1)
       else:
           if(t1=="oi"):
               print(t1)
           print("teste")
       while(a<b):
          a = a+1
          print(b)

if __name__ == "__main__":
    main()

