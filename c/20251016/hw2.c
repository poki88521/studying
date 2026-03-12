#include<stdio.h>
#include<math.h>

int judge(int i);

int main(){
    int n;
    scanf("%d",&n);
    for(int i = 100; i <= n; i++){
        if(judge(i)){
            printf("%d\n",i);
        }
    }
    return 0;
}

int judge(int i){
    int ge,shi,bai;
    ge = i % 10;
    shi = i / 10 % 10;
    bai = i / 100;
    if(pow(ge,3) + pow(shi,3) + pow(bai,3) == i){
        return 1;
    }
    return 0;
}