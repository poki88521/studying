#include<stdio.h>
#define false 0
#define true 1


int judge(int *p){
    for(int i = 0; i < 9; i++){
        if(*(p + i) > *(p + i + 1))return false;
    }
    return true;
}

void sort(int *p){
    while(!judge(p)){
        for(int i = 0; i < 9; i++){
            if(*(p + i) > *(p + i + 1)){
                int temp = *(p + i);
                *(p + i) = *(p + i + 1);
                *(p + i + 1) = temp;
            }
        }
    }
}

int main(){
    int num[10];
    int res = 1;
    for(int i = 0; i < 10; i++){
        scanf("%d",&num[i]);
    }
    sort(num);
    for(int i = 0; i < 9; i++){
        if(num[i] == num[i + 1]){
            if(num[i] == 1){
                printf("%d\n",1);
                return 0;
            }
            if(res == 1)res *= num[i];
            res *= num[i];
        }
        
    }
    if(res == 1){
        printf("No duplications");
    }else{
        printf("%d\n",res);
    }
    return 0;
}