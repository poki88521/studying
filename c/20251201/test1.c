#include<stdio.h>

typedef struct Student{
    char name[10];
    int score[6];
    int total;
    double average;
}Student;

int getSum(int* p){
    int sum = 0;
    for(int i = 0; i < 6; i++){
        sum += *(p + i);
    }
    return sum;
}

int main(){
    Student stus[3];
    for(int i = 0; i < 3; i++){
        for(int j = 0; j < 6; j++){
            scanf("%d",&(stus[i].score[j]));
        }
        stus[i].total = getSum(stus[i].score);
        stus[i].average = stus[i].total / 6.0;
    }

    for(int i = 0; i < 3; i++){
        printf("%.2lf\n",stus[i].average);
    }
    return 0;
}

