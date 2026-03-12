#include<stdio.h>

int main(){
    int score[10] = {0};
    int n = 0;
    int max = 0;
    int maxNum = 0;
    for(int i = 0; i < 40; i++){
        scanf("%d",&n);
        score[n - 1]++;
    }
    printf("Singer Received\n");
    max = score[0];
    for(int i = 0; i < 10; i++){
        if(score[i] > max){
            max = score[i];
            maxNum = i;
        } 
        printf("%d\t%d\n",i + 1,score[i]);
    }
    printf("The students' favorite singer is %d",maxNum + 1);
    
    return 0;
}