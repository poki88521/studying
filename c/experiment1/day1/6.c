#include<stdio.h>
#include<math.h>

int main(){
    int n;
    char c;
    scanf("%c%d",&c,&n);
    char res = c + 32 - n;
    printf("%c",res);
    return 0;
}