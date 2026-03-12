#include <stdio.h>

int main(){
    int n;
    scanf("%d", &n);
    int count = 0;
    
    for(int x = 1; x <= 18; x++){
        for(int y = 1; y <= 18; y++) {
            int z = 20 - x - y;            
            
            if(z >= 1 && (10 * x + 5 * y + z) == n){
                printf("x=%d,y=%d,z=%d\n", x, y, z);
                count++;
            }
        }
    }
    
    printf("count=%d\n", count);
    
    return 0;
}