#include<stdio.h>

int main(){
    char buffer[10];
    FILE *fp = NULL;
    fp = fopen("testfile.txt", "ab+");
    if(fp == NULL){
        printf("Failed");
    }else{
        printf("open!");
        printf("%s",fgets(buffer, 10, fp));
        printf("%s",buffer);
    }
    return 0;
}