#include<stdio.h>
#include<math.h>

int main(){
    char c;
    scanf("%c",&c);
    switch(c){
        case 'R':
            printf("Hazardous Waste");
            break;
        case 'G':
            printf("Household Food Waste");
            break;
        case 'B':
            printf("Recyclable Waste");
            break;
        case 'O':
            printf("Residual Waste");
            break;
        default:
            break;
    }
    
    return 0;
}