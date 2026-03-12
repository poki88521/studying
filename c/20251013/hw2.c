#include<stdio.h>
#include<math.h>

int main(){
    int a,b,c;
    printf("enter a,b,c:");
    scanf("%d%d%d",&a,&b,&c);
    if(a == b && b == c){
       printf("ET"); 
    }else if(a == b || b == c || a == c){
        printf("IT"); 
    }else{
        printf("OT"); 
    }
    
    return 0;
}