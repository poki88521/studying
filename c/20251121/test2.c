#include<stdio.h>

void getNum(int *arr, int *min, int *max){
    *min = *arr;
    *max = *arr;
    for(int i = 0; i < 10; i++){
        if(*min > *(arr + i)) *min = *(arr + i);
        if(*max < *(arr + i)) *max = *(arr + i);
    }
    return;
}

int main(){
    int arr[10] = {0};
    int min = 0;
    int max = 0;
    for(int i = 0; i < 10; i++){
        scanf("%d",arr + i);
    }
    getNum(arr,&min,&max);
    printf("min=%d,max=%d",min,max);
    return 0;
}