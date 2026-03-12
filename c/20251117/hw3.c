#include<stdio.h>

#define true 1
#define false 0

int check(char s[], int len){
    char* start = s;
    char* end = s + len - 1;
    while((start != end) && (start != end - 1)){
        if(*start != *end) return false;
        start++;
        end--;
    }
    return true;
}

int main(){
    char s[100] = {'\0'};
    printf("Please enter a string:");
    gets(s);

    int len = 0;
    while(*(s + len) != '\0'){
        len++;
    }

    if(check(s,len)){
        printf("It is a palindrome.");
    }else{
        printf("Not palindromes.");
    }
    return 0;
}   