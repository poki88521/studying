#include<stdio.h>

int main(){
    int arr[4][4] = {0};
    int m = 0;
    int sub = 0;
    for(int i = 0; i < 4; i++){
        for(int j = 0; j < 4; j++){
            scanf("%d",&arr[i][j]);
        }
    }

    for(int i = 0; i < 4; i++){
        m += arr[i][i];
        sub += arr[i][3 - i];
    }
    printf("The sum of the main diagonal is %d\n",m);
    printf("The sum of the subdiagonal is %d",sub);
    return 0;
}