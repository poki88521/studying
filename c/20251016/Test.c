#include<stdio.h>

int main(){
    int sum;
    int a,n;
    scanf("%d%d",a,n);
    for(int i = 1; i <= 10; i++){
        sum *= i;
    }
    printf("%d",sum);
    
    return 0;
}