#include<stdio.h>
#include<stdlib.h>

int main(){
    char *chs = malloc(100 * sizeof(char));
    char c;
    int count = 0;
    gets(chs);
    c = getchar();
    while(*chs != '\0'){
        if(*chs == c) count++;
        chs++;
    }
    if(count == 0){
        printf("Fail");
    }else{
        printf("%d",count);
    }
    return 0;
}