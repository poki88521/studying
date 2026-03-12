#include<stdio.h>
#include<math.h>

void out(int n){
    int numArr[3] = {0};
    for(int i = 0; i < 3; i++){
        numArr[i] = n / (int)pow(10,i) % 10;
    }

    for(int i = 0; i < 2; i++){
        if(numArr[i] > numArr[i + 1]){
            int temp = numArr[i];
            numArr[i] = numArr[i + 1];
            numArr[i + 1] = temp;
        }
    }

    if(numArr[0] > numArr[1]){
            int temp = numArr[0];
            numArr[0] = numArr[1];
            numArr[1] = temp;
        }

    printf("%d%d%d\n",numArr[0],numArr[1],numArr[2]);
}

int main(){
    int num = 0;
    scanf("%d",&num);
    while(num > 0){
        out(num);
        scanf("%d",&num);
    }
    return 0;
}