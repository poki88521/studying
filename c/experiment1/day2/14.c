#include<stdio.h>
#include<math.h>

int main(){
    float n1,n2;
    char op;
    scanf("%f%c%f",&n1,&op,&n2);
    switch(op){
        case '+':
            printf("%.2f+%.2f=%.2f", n1, n2, n1 + n2);
            break;
        case '-':
            printf("%.2f-%.2f=%.2f", n1, n2, n1 - n2);
            break;
        case '*':
            printf("%.2f*%.2f=%.2f", n1, n2, n1 * n2);
            break;
        case '/':
            if(n2 == 0){
               printf("The divisor is 0");
               break; 
            }
            printf("%.2f/%.2f=%.2f", n1, n2, n1 / n2);
            break;
        default:
            break;
    }
    return 0;
}