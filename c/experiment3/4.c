#include<stdio.h>

int main(){
    int num[9];
    int n = 0;
    int ifOut = 0;
    for(int i = 0; i < 9; i++){
        scanf("%d",&num[i]);
    }
    scanf("%d",&n);

    for(int i = 0; i < 9; i++){
        if(n < num[i] && ifOut == 0){
            printf("%4d",n);
            ifOut = 1;
        }
        printf("%4d",num[i]);
    }
    if(ifOut == 0){
        printf("%4d",n);
    }
    return 0;
}