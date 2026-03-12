#include<stdio.h>

float getsum(int n){
    float res = 0;
    for(int i = 1; i <= n; i++){
        res += (float)i / (float)(i + 1);
    }
    return res;
}

int main(){
    int n = 0;
    scanf("%d",&n);
    printf("%.4f",getsum(n));
    return 0;
}