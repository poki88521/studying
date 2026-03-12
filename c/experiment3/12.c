#include<stdio.h>
#include<stdlib.h>

int main(){
    int n = 0;
    printf("Please enter number of identifiers:");
    scanf("%d",&n);
    printf("Enter an identifier for the branch:\n");
    char *s0 = calloc(50 * n, sizeof(char));
    for(int i = 0; i < n; i++){
        char *p = s0 + 50 * i;
        scanf("%s",p);
    }


    for(int i = 0; i < n; i++){
        char *s = s0 + 50 * i;
        int flag = 0;
        if(!((*s >= 'a' && *s <= 'z') || (*s >= 'A' && *s <= 'Z') || *s == '_')){
            printf("IS illegal!\n");
            continue;
        }
        while(*s != '\0'){
            if(!((*s >= 'a' && *s <= 'z') || (*s >= 'A' && *s <= 'Z') 
            || *s == '_' || (*s >= '0' && *s <= '9'))){
                printf("IS illegal!\n");
                flag = 1;
                break;
            }
            s++;
        }
        if(flag == 1) continue;
        printf("Legal!\n");
        
    }
    return 0;
}

/*
6
3you
_678
abc
a
a%b
ChinaN1
*/