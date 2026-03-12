#include<stdio.h>

int main(){
    float exam,usual;
    while(1){
        printf("please enter ur exam score:");
        scanf("%f",&exam);
        if(exam < 0 || exam > 100){
            printf("what?\n");
            continue;
        }
        printf("please enter ur usual score:");
        scanf("%f",&usual);
        if(usual < 0 || usual > 100){
            printf("what?\n");
            continue;
        }else{
            break;
        }
    }



    float score = exam * 0.7 + usual * 0.3;
    if(score >= 60){
        printf("pass");
    }else{
        printf("failed");
    }

    return 0;
}