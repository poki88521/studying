#include<stdio.h>
#include<math.h>

int main(){
    float g,R,h,v;
    R = 6400.0;
    g = 0.0098;
    h = 400.0;
    v = sqrt((g * R * R) / (R + h));
    printf("%.2f",v);
    return 0;
}