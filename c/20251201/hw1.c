#include<stdio.h>

#define false 0
#define true 1

typedef struct stdinfo{
    char no[20];
    char name[10];
    float score[4];
    float gpa;
}Student;

float getGPA(float *p){
    float gpa = 0;
    for(int i = 0; i < 4; i++){
        if(*(p + i) < 60){
            continue;
        }else{
            gpa += 1 + (*(p + i) - 60) / 10.0;
        }
    }
    return gpa;
}

int judge(Student *p, int n){
    for(int i = 0; i < n - 1; i++){
        if((*(p + i)).gpa < (*(p + i + 1)).gpa)return false;
    }
    return true;
}

void sort(Student *p,int n){
    while(!judge(p,n)){
        for(int i = 0; i < n - 1; i++){
            if((*(p + i)).gpa < (*(p + i + 1)).gpa){
                Student temp = *(p + i);
                *(p + i) = *(p + i + 1);
                *(p + i + 1) = temp;
            }
        }
    }
}

int main(){
    int n = 0;
    Student stu[30];
    printf("Please enter students number:");
    scanf("%d",&n);
    printf("Please input all student information:\n");
    for(int i = 0; i < n; i++){
        scanf("%s%s",stu[i].no,stu[i].name);
        for(int j = 0; j < 4; j++){
            scanf("%f",&(stu[i].score[j]));
        }
        stu[i].gpa = getGPA(stu[i].score);
    }

    printf("Id\tName\tScore1\tScore2\tScore3\tScore4\tgpa\t\n");
    for(int i = 0; i < n; i++){
        printf("%s\t",stu[i].no);
        printf("%s\t",stu[i].name);
        for(int j = 0; j < 4; j++){
            printf("%.2f\t",stu[i].score[j]);
        }
        printf("%.2f",stu[i].gpa);
        printf("\n");
    }

    sort(stu,n);
    printf("The highest gpa is %.2f, Id is %s, name is %s.",stu[0].gpa,stu[0].no,stu[0].name);
    return 0;
}