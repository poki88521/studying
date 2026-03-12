#include<stdio.h>
#include<math.h>

int main(){
    float x = 0;
    float y = 0;
    scanf("%f",&x);
    if(x <= 0){
        y = (2 * x + 6) / 2;
    }else if(x < 10){
        y = (float)sqrt(x + 1);
    }else if(x == 10){
        y = 12;
    }else{
        y = x * x + 6;
    }
    printf("%.2f",y);
    return 0;
}