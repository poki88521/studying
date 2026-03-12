#include<stdio.h>
#include<string.h>



int main(){
    int s[100];
    
    for(int i = 1; i <= 3; i++){
        printf("Who is the inventor of C?");
        gets(s);
        if(!strcmp(s,"Dennis Ritchie")){
            printf("GOOD");
            return 0;
        }
        if(i == 3) break;
        printf("try again\n");
    }
    printf("Dennis Ritchie\n");
    return 0;
}