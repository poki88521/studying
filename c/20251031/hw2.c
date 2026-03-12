#include<stdio.h>

int main(){
    int arr[10];
    int num;

    for(int i = 0; i < 10; i++){
        scanf("%d",&arr[i]);
    }
    scanf("%d",&num);

    for(int i = 0; i < 10; i++){
        if(arr[i] == num){
            printf("%d",i);
            return 0;
        }
    }
    printf("Fail");
    return 0;
}