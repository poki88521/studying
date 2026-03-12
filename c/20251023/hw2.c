#include<stdio.h>
#include<math.h>

int judge(int num){
    int ge = num % 10;
    int shi = num / 10 % 10;
    int bai = num / 100;
    
    if(num == (pow(ge,3) + pow(shi,3) + pow(bai,3))){
        return 1;
    }
    return 0;
}

int main(){
    for(int i = 100; i < 1000; i++){
        if(judge(i)){
            printf("%4d",i);
        }
    }
    return 0;
}