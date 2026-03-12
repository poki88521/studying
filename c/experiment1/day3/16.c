#include<stdio.h>

int main(){
    int n = 0;
    float res = 0;
    scanf("%d",&n);
    for(int i = 1; i <= n; i++){
        float temp = (float)i / (float)(i + 1);
        if(i % 2 == 1){
            res += temp;
        }else{
            res -= temp;
        }
    }
    printf("%.2f",res);
    return 0;
}