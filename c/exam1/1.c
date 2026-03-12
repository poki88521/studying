#include<stdio.h>
#include<math.h>

int main(){
    float r, h, v = 0;
    printf("input r and h:");
    scanf("%f%f",&r,&h);
    v = (1.0 / 3.0) * 3.14 * (float)pow(r, 2) * h;
    printf("v=%.3f\n", v);
    return 0;
}