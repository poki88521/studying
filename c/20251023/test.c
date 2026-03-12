#include<stdio.h>

//int max(int a, int b);
//int max3(int x, int y, int z);

int main(){
    int a,b,c;
    scanf("%d%d%d",&a,&b,&c);
    printf("max=%d",max3(a,b,c));
    return 0;
}

/*
int max(int a, int b){
    return a > b ? a : b;
}
*/
int max3(int x, int y, int z){
    int temp = x;
    if(y > temp){
        temp = y;
    }
    if(z > temp){
        temp = z;
    }
    return temp;
}