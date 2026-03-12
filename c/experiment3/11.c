#include<stdio.h>
#include<stdlib.h>

int main(){
    char *s = malloc(sizeof(char) * 50);
    gets(s);
    char *start = s;
    char *end = s;
    while(*end != '\0'){
        end++;
    }
    end--;
    while(start != end && (end - start) != 1){
        if(*start != *end){
            printf("No");
            return 0;
        }
        start++;
        end--;
    }
    printf("Yes");
    return 0;
}