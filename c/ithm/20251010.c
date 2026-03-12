#include<stdio.h>

typedef union MoneyType{
    double d;
    int i;
    char c[100];

}mt;



int main(){
    mt money;
    money.i = 100;
    money.d = 20.0;
    printf("%.2lf",money.d);

    
    return 0;
}