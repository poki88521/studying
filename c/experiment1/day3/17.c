#include<stdio.h>

int main(){
    int f = 0;
    int d = 0;
    float c = 0;
    scanf("%d%d",&f,&d);
    for(int i = 0; i <= f; i += d){
        c = ((float)5 * (i - 32)) / 9;
        printf("%5d%10.2f\n",i,c);
    }
    return 0;
}