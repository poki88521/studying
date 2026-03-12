#include<stdio.h>
#include<math.h>
#define true 1
#define false 0


int ifPrime(int n){
    if(n == 2)return true;
    for(int i = 2; i <= (int)sqrt(n); i++){
        if(n % i == 0)return false;
    }
    return true;
}

int main(){
    int n = 0;
    int res[2] = {0,0};
    scanf("%d",&n);
    int min = 2;
    int max = n - 3;
    int prime[100] = {0};
    int addr = 0;       //prime的数组地址
    for(int i = min; i <= max; i++){
        if(ifPrime(i)){
            prime[addr] = i;
            addr++;
        }
    }


    int d = n;
    for(int i = 0; i <= (addr / 2) + 1; i++){
        for(int j = (addr / 2) + 2; j <= addr; j++){
            if(prime[j] - prime[i] < d && prime[j] + prime[i] == n){
                res[0] = prime[i];
                res[1] = prime[j];
                d = prime[j] - prime[i];
            }
        }
    }

    printf("%d %d",res[0],res[1]);
    return 0;
}