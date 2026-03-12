#include<stdio.h>

int main(){
    int a;
    scanf("%d",&a);
    int res = (a / 100) + (a / 10 % 10) + a % 10;
    printf("%d",res);
    return 0;
}