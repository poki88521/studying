#include<stdio.h>

int main(){
    int n;
    int sum = 1;
    scanf("%d",&n);
    for(int i = 1; i <= n; i += 2){
        
        sum *= i;
    }
    printf("s=%d",sum);
    return 0;
}