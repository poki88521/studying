#include<stdio.h>
#include<math.h>

int main(){
    float x,y;
    scanf("%f",&x);
    if(x < -1){
        y = fabs(x) + 2.3;
    }else if(x < 0){
        y = 5 * x * x + 2;
    }else if(x == 0){
        y = 10;
    }else if(x < 10){
        y = 8.2 * x;
    }else{
        y = 1.0 / x + 18;
    }

    printf("%.2f",y);
    return 0;
}