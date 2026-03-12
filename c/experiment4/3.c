#include<stdio.h>

void exchange(int *arr, int n){
    int count = 0;
    if(n % 2 == 0)count = n;
    if(n % 2 == 1)count = n - 1;
    int temp = 0;
    for(int i = 0; i < count; i += 2){
        temp = arr[i];
        arr[i] = arr[i + 1];
        arr[i + 1] = temp;
    }
}
int main(){
    int n = 0;
    int arr[20] = {0};
    scanf("%d",&n);
    for(int i = 0; i < n; i++){
        scanf("%d",arr + i);
    }
    exchange(arr, n);
    for(int i = 0; i < n; i++){
        printf("%3d",*(arr + i));
    }
    return 0;
}