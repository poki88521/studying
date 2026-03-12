#include<stdio.h>

int length(char *p){
    int i = 0;
    while(*(p + i) != '\0'){
        i++;
    }
    return i;
}

int main(){
    char s[100] = {'\0'};
    gets(s);
    printf("Please enter a string:length is %d",length(s));
    return 0;
}