#include<stdio.h>
#include<math.h>

int main(){
    float m, p1, p2;
    scanf("%f%f%f",&m,&p1,&p2);
    float res = (7.8 - m) * p1 + p2;
    printf("%.2f",res);
    return 0;
}