#include<stdio.h>

int gcd(int a, int b){
    if(a % b == 0) return b;
    return gcd(b, a % b);
}

int main(){
    int a = 0;
    int b = 0;
    scanf("%d%d",&a,&b);
    int o1 = gcd(a,b);
    int o2 = (a * b) / o1;
    int i1 = a < b? a : b;
    int i2 = a < b? b : a;
    printf("gcd(%d,%d)=%d\n",i1,i2,o1);
    printf("lcm(%d,%d)=%d",i1,i2,o2);
    return 0;
}