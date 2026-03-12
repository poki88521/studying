#include<stdio.h>

int judge(int arr[],int n){
    int count = 0;
    for(int i = 0; i < n - 1; i++){
        if(arr[i] < arr[i + 1]) count++;
    }
    if(count == n - 1) return 0;
    return 1;
    
}

void getarr(int arr[],int n){
    printf("pls enter the elements:");
    for(int i = 0; i < n; i++){
        scanf("%d",&arr[i]);
    }
}

void sort(int arr[],int n){
    while(judge(arr,n)){
        for(int i = 0; i < n - 1; i++){
            if(arr[i] > arr[i + 1]){
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
    }
}

void show(int arr[], int n){
    printf("result:");
    for(int i = 0; i < n; i++){
        printf("%d ",arr[i]);
    }
}

int main(){
    int n = 0;
    printf("pls enter the length of arr:");
    scanf("%d",&n);
    int arr[5];
    getarr(arr,n);
    sort(arr,n);
    show(arr,n);
    return 0;
}

