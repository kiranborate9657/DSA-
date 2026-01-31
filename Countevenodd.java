#include <stdio.h>

int main() {
    int n, arr[100];
    int even = 0, odd = 0;

    printf("Enter number of elements: ");
    scanf("%d", &n);

    printf("Enter array elements:\n");
    for(int i = 0; i < n; i++) {
        scanf("%d", &arr[i]);

        if(arr[i] % 2 == 0)
            even++;
        else
            odd++;
    }

    printf("Even numbers count = %d\n", even);
    printf("Odd numbers count = %d", odd);

    return 0;
}
