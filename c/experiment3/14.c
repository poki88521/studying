#include<stdio.h>

int judge(int arr[4][5], int i, int j){
    for(int m = 0; m < 4; m++){
        if(arr[m][j] < arr[i][j])return 0;
    }
    for(int n = 0; n < 5; n++){
        if(arr[i][n] > arr[i][j])return 0;
    }
    return 1;
}

int main(){
    int arr[4][5] = {{0}};
    for(int i = 0; i < 4; i++){
        for(int j = 0; j < 5; j++){
            scanf("%d",&arr[i][j]);
        }
    }

    for(int i = 0; i < 4; i++){
        for(int j = 0; j < 5; j++){
            if(judge(arr, i, j)){
                printf("matrix[%d][%d]=%d",i,j,arr[i][j]);
                return 0;
            }
        }
    }
    printf("No Saddle Point");
    return 0;
}