#include<stdio.h>

int main(){
    float score[10];
    int count = 0;
    for(int i = 0; i < 10; i++){
        scanf("%f",&score[i]);
        if(score[i] >= 60)count++;
    }
    printf("%.2f",count / 10.0);

    return 0;
}