#include<stdio.h>

int isOdd(int a);

int main(){
    int num;
    for(int i = 0; i < 10; i++){
        scanf("%d",&num);
        if(isOdd(num)){
            printf("%d:odd\n",num);
        }else{
            printf("%d:even\n",num); 
        }
    }
    return 0;
}

int isOdd(int a){
    return (a % 2 != 0);
}