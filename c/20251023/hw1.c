#include<stdio.h>

float avg(float a,float b,float c){
    return (a + b + c) / 3.0;
}

int main(){
    float a,b,c;
    scanf("%f%f%f",&a,&b,&c);
    printf("%.2f",avg(a,b,c));
    return 0;
}