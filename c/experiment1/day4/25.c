#include<stdio.h>
#include<math.h>


int main(){
    int arr[100];
    int i = 0;
    int max = 0;
    while(1){
        scanf("%d",&arr[i]);
        if(arr[i] == 0) break;
        i++;
    }

    i -= 1;
    max = arr[i];
    for(; i >= 0; i--){
        if(arr[i] > max) max = arr[i];
    }
    printf("%d",max);
    
    return 0;
}