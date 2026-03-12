#include<stdio.h>
#include<math.h>

int main(){
    float a,b;
    scanf("%f%f",&a,&b);
    float res = sqrt(a * a + b * b);
    printf("%.2f",res);
    return 0;
}