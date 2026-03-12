#include<stdio.h>

int main(){
    int n = 0;
    int res = 0;
    scanf("%d",&n);
    for(int i = 1; i <= n; i++){
        res += i * (n - i + 1);
    }
    printf("%d",res);
    return 0;
}