#include<stdio.h> 
int main(){char s[100] = {'\0'};int i = 0;int count = 0;gets(s);while(*(s + i) != '\0'){count++;i++;}printf("%d",count);return 0;}