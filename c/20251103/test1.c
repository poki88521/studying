#include<stdio.h>

int main(){
    int arr[3][4] = {
        {1,2,3,4},
        {5,7,2,6},
        {2,6,0,1}};
    int max = 0;
    int x = 0;
    int y = 0;
    max = arr[0][0];
    for(int i = 0; i < 3; i++){
        for(int j = 0; j < 4; j++){
            if(arr[i][j] > max){
                max = arr[i][j];
                x = i;
                y = j;
            } 
        }
    }
    printf("max=%d,arr[%d][%d]",max,x,y);
    return 0;
}