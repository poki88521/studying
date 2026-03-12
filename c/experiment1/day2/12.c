#include<stdio.h>
#include<math.h>

int main(){
    float h,w,t;
    scanf("%f%f",&h,&w);
    t = w / pow(h,2);
    printf("t=%.2f,",t);
    if(t < 18){
        printf("Thin,You need more nutrition.");
    }else if(t < 25){
        printf("Congratulations,fingers are normal!");
    }else if(t < 27){
        printf("Overweight,You need to lose weight.");
    }else{
        printf("Obesity,You have to lose weight.");
    }
    
    return 0;
}