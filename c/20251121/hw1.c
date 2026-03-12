#include<stdio.h>

int judge(int arr[], int n){
    for(int i = 0; i < n - 1; i++){
        if(*(arr + i) > *(arr + i + 1)) return 1;
    }
    return 0;
}

void exchange(int *a, int *b){
    int temp = *a;
    *a = *b;
    *b = temp;
    return;
}

void sort(int arr[], int n){
    while(judge(arr,n)){
        for(int i = 0; i < n - 1; i++){
            if(*(arr + i) > *(arr + i + 1)) exchange(arr + i, arr + i + 1);
        }
    }
    return;
}

int main(){
    int n = 0;
    printf("Enter n:");
    scanf("%d",&n);
    int arr[n];
    printf("Enter n number:");
    for(int i = 0; i < n; i++){
        scanf("%d",arr + i);
    }
    sort(arr,n);
    printf("Sort of number:");
    for(int i = 0; i < n; i++){
        printf("%5d",*(arr + i));
    }

    return 0;
}