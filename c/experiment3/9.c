#include<stdio.h>

int main(){
    int arr[15][15] = {{0}};
    int n = 0;
    scanf("%d",&n);
    for(int i = 0; i < n; i++){
        arr[i][0] = 1;
        arr[i][i] = 1;
        for(int j = 0; j <= i; j++){
            if(i >= 2){
            arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
            }
            printf("%5d",arr[i][j]); 
        }
        printf("\n");
    }
    return 0;
}