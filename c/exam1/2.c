#include<stdio.h>

float fun(float a,float b,float c,int x){
    return a * x * x + b * x + c;
}

int main(){
    float a, b, c;
    scanf("%f%f%f",&a, &b, &c);
    printf("%.2f",fun(a,b,c,20) - fun(a,b,c,10));
    return 0;
}