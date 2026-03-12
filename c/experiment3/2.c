#include<stdio.h>
void sort1(int* p){
    for(int i = 0; i < 9; i++){
        if(*(p + i) > *(p + i + 1)){
            int temp = *(p + i);
            *(p + i) = *(p + i + 1);
            *(p + i + 1) = temp;
        }
    }
}

int main(){
    int score[10];
    int tgt = 0;
    for(int i = 0; i < 10; i++){
        scanf("%d",&score[i]);
    }
    scanf("%d",&tgt);
    sort1(score);
    for(int i = 0; i < 10; i++){
        if(score[i] == tgt){
            printf("%d",i);
            return 0;
        }
    }
    printf("Fail");
    return 0;
}