#include<stdio.h>
#include<math.h>
#define true 1
#define false 0

int getDigit(int n, int d){
    return n / (int)pow(10,d) % 10;
}

int judge(int n, int* rn){
    *rn = 0;
    for(int i = 0; i < 4; i++){
        *rn = *rn * 10 + getDigit(n,i);
    }

    if(*rn + n == 9999)return true;
    return false;
}

int main(){
    int min = 0;
    int max = 0;
    int rn = 0;
    scanf("%d%d",&min, &max);
    for(int i = min; i <= max; i++){
        if(judge(i,&rn)){
            printf("%4d,%4d\n",i,rn);
        }
    }
    return 0;
}