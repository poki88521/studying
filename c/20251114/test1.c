#include<stdio.h>

void change(int a, int b){
    int temp = a;
    a = b;
    b = temp;
    return;
}

void changeP(int* p1, int* p2){
    int temp = *p1;
    *p1 = *p2;
    *p2 = temp;
    return;
}

int main(){
    int a = 0;
    int b = 0;
    scanf("%d%d",&a,&b);
    printf("before:%d %d\n",a,b);
    changeP(&a,&b);
    printf("after:%d %d\n",a,b);
    return 0;
}