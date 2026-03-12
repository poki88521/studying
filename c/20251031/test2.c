#include<stdio.h>


void show(int* p,int len){
    for(int i = 0; i < len; i++){
        printf("%d ",*(p + i));
    }
    printf("\n");
}

int main(){
    int n,temp;
    printf("pls enter the length of array:");
    scanf("%d",&n);
    int arr[n];
    printf("please enter the elements:");
    for(int i = 0; i < n; i++){
        scanf("%d",&arr[i]);
    }
    

    for(int i = 0; i < n / 2; i++){
        temp = arr[i];
        arr[i] = arr[n - 1 - i];
        arr[n - 1 - i] = temp;
    }
    show(&arr,n);

    return 0;
}