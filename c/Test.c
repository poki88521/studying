#include<stdio.h>
#include<stdlib.h>
#include<windows.h>

void init(char arr[6][20]){
    for(int i = 0; i < 6; i++){
        for(int j = 0; j < 20; j += 2){
            if(i % 2 == 0){
                arr[i][j] = ' ';
                arr[i][j + 1] = '0';
            }else{
                arr[i][j] = '0';
                arr[i][j + 1] = ' ';
            }
        }
    }
}

void show(char arr[6][20]){
    for(int i = 0; i < 6; i++){
        for(int j = 0; j < 20; j++){
            printf("%c",arr[i][j]);
        }
        printf("\n");
    }
}

void modarr(char arr[6][20]){
    char temp;
    for(int i = 0; i < 6; i++){
        for(int j = 0; j < 20; j += 2){
            temp = arr[i][j];
            arr[i][j] = arr[i][j + 1];
            arr[i][j + 1] = temp;
        }
    }
}

int main(){
    char arr[6][20];
    init(arr);
    int num = 0;
    while(num < 10000){
        system("cls");
        show(arr);
        modarr(arr);
        Sleep(166);
        num++;
    }
    return 0;
}