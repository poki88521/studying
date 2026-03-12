#include<stdio.h>


int main(){
    int a[3][2] = {{1,2},{3,4},{5,6}};
    int (*p)[2];
    p = a;
    printf("%d",(*(p + 1))[1]);
    return 0;
}