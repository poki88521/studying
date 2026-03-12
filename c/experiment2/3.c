#include<stdio.h>
#include<math.h>
#define true 1
#define false 0

int judge(int n){
    if((n % 4 == 0 && n % 100 != 0) || (n % 400 == 0)) return true;
    return false;
}

int main(){
    int min = 0;
    int max = 0;
    scanf("%d%d",&min, &max);
    printf("the leap year is:\n");
    for(int i = min; i <= max; i++){
        if(judge(i)){
            printf("%6d",i);
        }
    }
    
    return 0;
}