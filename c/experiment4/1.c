#include<stdio.h>

int main(){
    int arr[10] = {0};
    int n = 0;
    for(int i = 0; i < 10; i++){
        scanf("%d",arr + i);
    }
    scanf("%d",&n);
    for(int i = 0; i < 10; i++){
        if(*(arr + i) == n){
            printf("%d",i);
            return 0;
        }
    }
    printf("-1");
    return 0;
}