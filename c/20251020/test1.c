#include<stdio.h>
#include<math.h>

int main(){
    int m;
    scanf("%d",&m);
    for(int i = 2; i <= sqrt(m); i++){
        if(m % i == 0){
            printf("not a prime");
            return 0;
        }
    }

    printf("prime");
    return 0;
}