#include<stdio.h>

int main(){
    int arr[10];
    int sum;
    for(int i = 0; i < 10; i++){
        scanf("%d",&arr[i]);
    }

    for(int i = 0; i < 10; i++){
        printf("%d\n",arr[i]);
        sum += arr[i];
    }
    printf("sum=%d",sum);

    return 0;
}