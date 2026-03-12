#include<stdio.h>

int main(){
    int num[10];
    for(int i = 0; i < 10; i++){
        scanf("%d",&num[i]);
    }

    for(int i = 0; i < 9; i++){
        printf("%3d",num[i + 1]);
    }
    printf("%3d",num[0]);
    return 0;
}