#include<stdio.h>
#include<math.h>

int fact(int n){
    if(n == 0) return 1;
    int res = 1;
    for(int i = 1; i <= n; i++){
        res *= i;
    }
    return res;
}

int main(){
    int n = 0;
    double e = 0;
    while(1 / (double)fact(n) >= 0.0001){
        e += 1 / (double)fact(n);
        n++;
    }
    printf("e=%.4lf\n",e);

    return 0;
}