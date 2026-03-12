#include<stdio.h>

int main(){
    int arr[10];
    int n = 0;
    for(int i = 0; i < 10; i++){
        scanf("%d",&arr[i]);
    }

    int hi = 9;
    int lo = 0;
    int mid;
    scanf("%d",&n);
    while((hi - lo) >= 0){
        mid = (hi + lo) / 2;
        if(arr[mid] == n){
            printf("array[%d]=%d",mid,n);
            return 0;
        }else if(arr[mid] < n){
            lo = lo + 1;
            continue;
        }else if(arr[mid] > n){
            hi = hi - 1;
        }

    }
    printf("Fail");
    return 0;
}