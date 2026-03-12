#include<stdio.h>

int getgcd(int m, int n){
    if(m % n == 0) return n;
    return getgcd(n, m % n);
}

void find(int m, int n, int *gcd, int *lcm){
    *gcd = getgcd(m, n);
    *lcm = m * n / *gcd;
}

int main(){
    int a = 0;
    int b = 0;
    int gcd = 0;
    int lcm = 0;
    scanf("%d%d", &a, &b);
    find(a, b, &gcd, &lcm);
    printf("The greatest common divisor is %d\n",gcd);
    printf("Least common multiple is %d",lcm);
    return 0;
}