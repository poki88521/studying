#include<stdio.h>

int judge(int* p,int len){
    for(int i = 0; i < len - 1; i++){
        if(*(p + i) > *(p + i + 1))return 1;
    }
    return 0;
}

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

    while(judge(&arr,n)){
        for(int i = 0; i < n - 1; i++){
            if(arr[i] > arr[i + 1]){
                temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
    }

    show(&arr,n);


    return 0;
}