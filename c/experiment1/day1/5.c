#include<stdio.h>

int main(){
    int a,b,c;
    scanf("%d%d%d",&a,&b,&c);
    float x = (float)(c - (b - a)) / a;
    printf("%.2f",x);
    return 0;
}