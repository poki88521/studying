#include<stdio.h>

double convert(double c){
    return (9 * c / 5.0) + 32;
}

int main(){
    double c = 0;
    scanf("%lf",&c);
    printf("%.2lf",convert(c));
    return 0;
}