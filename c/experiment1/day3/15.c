#include<stdio.h>

int main(){
    int m = 0;
    int n = 0;
    int count = 0;
    scanf("%d%d",&m,&n);
    for(int i = m; i <= n; i++){
        if(i % 7 == 0)count++;
    }
    printf("%d",count);
    return 0;
}