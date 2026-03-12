#include<stdio.h>

int main(){
    int max = 0;
    int min = 0;
    int temp = 0;
    for(int i = 0; i < 16; i++){
        scanf("%d",&temp);
        if(temp > max)max = temp;
        if(temp < min)min = temp;
    }
    printf("%d",max - min);
    return 0;
}