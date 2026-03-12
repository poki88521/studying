#include<stdio.h>
#include<math.h>

int main(){
    double p0,rate;
    int n;
    scanf("%lf%lf%d",&p0,&rate,&n);
    double pn = p0 * pow(1 + rate,n);
    printf("%.2lf",pn);
    return 0;
}