#include<stdio.h>
#include<math.h>

int judge(int t){
    int count = 0;
    for(int i = 1; i < t; i++){
        if(t % i == 0)count += i;
    }
    return (count == t);
}

int main(){
    int m = 0;
    int n = 0;
    scanf("%d%d",&m,&n);
    for(int i = m; i <= n; i++){
        if(judge(i)){
            printf("%d\n",i);
        }
    }
    return 0;
}