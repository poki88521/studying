#include<stdio.h>

void input(int arr[]){
    for(int i = 0; i < 10; i++){
        scanf("%d",arr + i);
    }
    return;
}


int main(){
    int arr[10] = {0};
    int sum = 0;
    input(arr);

    printf("Output reverse order:\n");
    for(int i = 9; i >= 0; i--){
        printf("%4d",*(arr + i));
        if(*(arr + i) > 0) sum += *(arr + i);
    }

    printf("\n");
    printf("The sum of all positive numbers:\n");
    printf("sum=%4d",sum);
    return 0;
}