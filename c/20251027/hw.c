#include<stdio.h>


int gcd(int a, int b){
    if(b == 0) return a;
    return gcd(b, a % b);
}

int main(){
    int a,b;
    scanf("%d%d", &a, &b);
    int min = a > b?b : a;
    int max = a > b?a : b;
    int greatestCommonFactor = gcd(max, min);
    printf("gcd(%d,%d)=%d\n",min ,max , greatestCommonFactor);
    printf("lcm(%d,%d)=%d",min, max, a * b / greatestCommonFactor);
    return 0;
}