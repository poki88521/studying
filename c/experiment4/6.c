#include<stdio.h>
#include<stdlib.h>
#include<math.h>

typedef struct Student{
    char num[10];
    char name[10];
    float bmi;
    float h;
    float m;
}Student;

void getbmi(Student *p){
    (*p).bmi = (*p).m / ((*p).h * (*p).h);
}

int main(){
    int n = 0;
    printf("Please enter number of student:");
    scanf("%d",&n);
    Student *stu = calloc(n, sizeof(Student));
    printf("Please input the student information:\n");
    for(int i = 0; i < n; i++){
        scanf("%s",(*(stu + i)).num);
        scanf("%s",(*(stu + i)).name);
        scanf("%f",&(*(stu + i)).h);
        scanf("%f",&(*(stu + i)).m);
        getbmi(stu + i);
    }

    for(int i = 0; i < n; i++){
        printf("%12s%12s%7.2f%7.2f%7.2f\n",
        (*(stu + i)).num, (*(stu + i)).name, (*(stu + i)).h,
        (*(stu + i)).m, (*(stu + i)).bmi);
    }
    return 0;
}

/*
1001 jiji 1.58 68
1002 popo 1.65 58
1003 youyou 1.62 62
1004 kyjy 1.85 68
*/