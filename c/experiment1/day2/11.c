#include<stdio.h>
#include<math.h>

int main(){
    char c;
    scanf("%c",&c);
    if(c >= 'a' && c <= 'z'){
        printf("Lowerletter");
    }else if(c >= 'A' && c <= 'Z'){
        printf("Upperletter");
    }else if(c >= '0' && c <= '9'){
        printf("Digitletter");
    }else{
        printf("Otherletter");
    }
    return 0;
}