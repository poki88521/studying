#include<stdio.h>
#include<math.h>

int main(){
    
    float x,y;
    printf("x:");
    scanf("%f",&x);
    if(x <= 0){
        y = 0;
    }else if(x < 10){
        y = 1.0 / x;
    }else if(x == 10){
        y = (2.0 / 3.0) * x + 1;
    }else{
        y = sqrt(5 * x - 1);
    }

    printf("%.2f\n",y);
    
    return 0;
}