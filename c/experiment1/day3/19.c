#include<stdio.h>

int main(){
    int n = 0;
    int res = 0;
    int start = 0;
    scanf("%d",&n);
    if(n % 2 == 1){
        start = 1;
    }else{
        start = 2;
    }
    for(int i = start; i <= n; i += 2){
        res += i;
    }
    printf("%d",res);
    return 0;
}