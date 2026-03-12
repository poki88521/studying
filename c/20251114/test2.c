#include<stdio.h>

int getMax(int arr[][4]){
    int max = arr[0][0];
    for(int i = 0; i < 3; i++){
        for(int j = 0; j < 4; j++){
            if(arr[i][j] > max) max = arr[i][j];
        }
    }
    return max;
}

int main(){
    int arr[3][4] = {0};
    for(int i = 0; i < 3; i++){
        for(int j = 0; j < 4; j++){
            scanf("%d",&arr[i][j]);
        }
    }

    printf("max number:%d",getMax(arr));
    
    return 0;
}