#include<stdio.h>
#include<math.h>

int main(){
    int a,b;
    scanf("%d%d",&a,&b);
    float rate = (float)(a - b) / b * 100.0;
    printf("%.2f",rate);
    return 0;
}