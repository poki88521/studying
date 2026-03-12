#include<stdio.h>
#include<math.h>



int main(){
    int a = 0;
    int n = 0;
    scanf("%d%d",&a,&n);

    int i = a;
    while(n != 0){
        if(i % 3 == 2 && i % 5 == 3 && i % 7 == 4){
            printf("%5d",i);
            n--;
        }
        i++;
    }
    
    return 0;
}