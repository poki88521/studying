#include<stdio.h>
#include<string.h>

int main(){
    char strs[5][20] = {'\0'};
    int max = 0;
    char res[20];
    for(int i = 0; i < 5; i++){
        gets(strs[i]);
    }
    
    for(int i = 0; i < 5; i++){
        int j = 0;
        int count = 0;
        while(strs[i][j] != '\0'){
            count++;
            j++;
        }
        if(count > max){
            max = count;
            strcpy(res,strs[i]);
        }
    }
    printf("Longest:");
    puts(res);
    return 0;
}