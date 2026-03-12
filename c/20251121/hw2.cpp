#include<stdio.h>

void findmax(int *arr, int n, int *max, int *pos){
    *max = *arr;
    for(int i = 0; i < n; i++){
        if(*max < *(arr + i)){
            *max = *(arr + i);
            *pos = i;
        }
    }

}

int main(){
    int arr[20] = {0};
    int n = 0;
    int pos = 0;
    int max = 0;
    scanf("%d",&n);
    for(int i = 0; i < n; i++){
        scanf("%d",arr + i);
    }
    findmax(arr, n, &max, &pos);
    printf("%4d%3d",max,pos);
    return 0;
}