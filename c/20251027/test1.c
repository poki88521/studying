#include<stdio.h>


long fact(int n){
    long res = 1L;
    if(n == 0) return 1;

    for(int i = 1; i <= n; i++){
        res *= i;
    }
    return res;
}

long c(int n, int m){
    return fact(n) / (fact(m) * fact(n - m));
}

int main(){
    int n,m;
    printf("please enter n & m:");
    scanf("%d%d",&n,&m);
    printf("%ld",c(n,m));
    return 0;
}