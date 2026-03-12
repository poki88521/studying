#include<stdio.h>

void sort(int a[], int n) {
    int i, j, temp;
    for (i = 0; i < n - 1; i++) {
        for (j = 0; j < n - i - 1; j++) {
            if (a[j] > a[j + 1]) {
                // 交换位置
                temp = a[j];
                a[j] = a[j + 1];
                a[j + 1] = temp;
            }
        }
    }
}

int main() {
    int arr[100];
    int n = 0;
    int i = 0;
    
    printf("Please enter number:");
    scanf("%d", &n);
    
    printf("Please enter %d integers:", n);
    for (i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }
    
    sort(arr, n);
    
    printf("in ascending order:\n");
    for (i = 0; i < n; i++) {
        printf("%4d", arr[i]);
    }
    printf("\n");
    
    return 0;
}