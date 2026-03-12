#include<stdio.h>

int main(){
    char ch;
    scanf("%c",&ch);
    if(ch >= '0' && ch <= '9'){
        printf("%c is a numeric character.",ch);
    }else if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')){
        printf("%c is a english letter.",ch);
    }else if(ch == ' '){
        printf("%c is a blankspace.",ch);
    }else{
        printf("%c is other character.",ch);
    }
    return 0;
}