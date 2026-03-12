#include<stdio.h>
#include<stdlib.h>

int find(int *a, int n, int x){
    int count = 0;
    for(int i = 0; i < n; i++){
        if(*(a + i) == x) count++;
    }
    return count;
}

int main(){
    int n = 0;
    int x = 0;
    printf("Please enter the number of elements:");
    scanf("%d",&n);
    printf("Please enter %d integers:",n);
    int *a = calloc(n, sizeof(int));
    for(int i = 0; i < n; i++){
        scanf("%d",a + i);
    }
    printf("Please enter the number you are looking for:");
    scanf("%d",&x);
    printf("There are %d Numbers.", find(a, n, x));
    return 0;
}