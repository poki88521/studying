#include<stdio.h>

int main(){
    int s = 1;
    int n;
    scanf("%d",&n);
    for(int i = 2; i <= n; i++){
        if(i % 2 == 0){
            s *= i;
        }
    }
    printf("s=%d",s);
    return 0;
}