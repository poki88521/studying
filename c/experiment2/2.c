#include<stdio.h>
#include<math.h>
#define true 1
#define false 0

int judge(int n){
    int ge = n % 10;
    int shi = n / 10 % 10;
    int bai = n / 100;
    if(pow(ge,3) + pow(shi,3) + pow(bai,3) == n){
        return true;
    }
    return false;
}

int main(){
    int n = 0;
    scanf("%d",&n);
    for(int i = 100; i <= n; i++){
        if(judge(i)){
            printf("%d ",i);
        }
    }
    return 0;
}