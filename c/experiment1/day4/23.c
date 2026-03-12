#include<stdio.h>
#include<math.h>

int judge(int i){
    if(pow(i % 10,3) + pow(i / 10 % 10,3) + pow(i / 100,3) == i) return 1;
    return 0;
}

int main(){
    int n = 0;
    scanf("%d",&n);
    for(int i = 100; i <= n; i++){
        if(judge(i)){
            printf("%d\n",i);
        }
    }
    
    return 0;
}