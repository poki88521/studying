#include<stdio.h>
char* stringCopy(char *from, char *to){
    int i = 0;
    while(*(from + i) != '\0'){
        *(to + i) = *(from + i);
        i++;
    }

    return to;
}

int main(){
    char arr1[100] = {'\0'};
    char arr2[] = NULL;

    scanf("%s",arr1);
    stringCopy(arr1,arr2);
    printf("%s",arr2);
    return 0;
}