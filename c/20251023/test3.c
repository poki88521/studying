#include<stdio.h>
#include<math.h>

int isPrime(int x);

int main(){
    int a = 5;
    if(isPrime(a)){
        printf("%d:prime",a);
    }else{
        printf("%d:no prime",a);
    }
    return 0;
}

 int isPrime(int x){
    for(int i = 2; i < sqrt(x); i++){
        if(x % i == 0){
            return 0;
        }
    }
    return 1;
}