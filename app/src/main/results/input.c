#include <stdio.h>
#include <math.h>
#include <string.h>

int main(){

    int True = 1;
    int False = 1;

    float a;
    float b;
    float c;
    float d;
    char t1[1000];
    char t2[1000];
    int x;
    x = True;
    printf("Escreva o numero a:\n");
    scanf("%f", &a);
    printf("Escreva o numero b");
    scanf("%f", &b);
    printf("Escreva o numero d");
    scanf("%f", &d);
    d = pow(d, 2);
    printf("d ao quadrado:");
    printf("%f\
", d);
    d = (int)d%(int)3;
    printf("d resto da divisao por 3:");
    printf("%f\
", d);
    strcpy(t1, "Meu Teste");
    a = 1+2*a;
    c = 5.755;
    printf(t1);
    printf("Ola Mundo");
    if(x==True){
        printf(t1);
        if(a<c){
            printf("a menor que c!");
        }else{
            printf("c maior igual a A....");
        }
    }
    if(a>b){
        printf("%f\
", a);
    }else{
        printf("%f\
", b);
    }
    while(a<b){
       a = a+1;
       printf("%f\
", a);
       if(a<b){
           printf("oi");
       }else{
           printf("oi");
       }
       if(a>c){
           printf(t1);
       }else{
           if(t1=="oi"){
               printf(t1);
           }
           printf("teste");
       }
       while(a<b){
          a = a+1;
          printf("%f\
", b);
       }
    }


    return 0;

}
