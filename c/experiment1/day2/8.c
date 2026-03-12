#include<stdio.h>
#include<math.h>

int main(){
    float x,y;
    scanf("%f",&x);
    if(x < -5){
        y = pow(x,2) / (x + 10);
    }else if(x < 0){
        return 0;
    }else if(x == 0){
        y = 1;
    }else if(x < 10){
        y = 3 * x - 9;
    }else{
        y = sqrt(x);
    }
    printf("%.2f",y);
    return 0;
}