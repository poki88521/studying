#include<stdio.h>
#include<math.h>

int main(){
    int x;
    scanf("%d",&x);
    switch(x % 8){
        case 1:
        case 2:
        case 3:
        case 4:
            printf("Tong");
            break;
        case 5:
        case 6:
        case 7:
        case 0:
            printf("Da");
            break;
        default:
            break;
    }
    
    return 0;
}