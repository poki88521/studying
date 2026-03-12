#include<stdio.h>

int main(){
    float avgp = 0;
    int countp = 0;
    float avgn = 0;
    int countn = 0;
    int num = 0;
    for(int i = 0; i < 10; i++){
        scanf("%d",&num);
        if(num > 0){
            avgp += num;
            countp++;
        } 
        if(num < 0){
            avgn += num;
            countn++;
        } 
    } 
    printf("ave1=%.2f, ave2=%.2f",avgp / countp ,avgn / countn);
    return 0;
}