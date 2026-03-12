#include<stdio.h>
#include<string.h>



int main(){
    char s[100] = {'\0'};
    char tgt;
    int i = 0;
    int count = 0;

    gets(s);
    tgt = getchar();
    while(s[i] != '\0'){
        if(s[i] == tgt){
            count++;
        }
        i++;
    }
    if(count == 0){
        printf("Fail");
    }else{
        printf("%d",count);
    }
    return 0;
}