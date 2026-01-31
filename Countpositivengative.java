#include <stdio.h>

int main() {
    int n, arr[100];
    int positive = 0, negative = 0, zero = 0;

    printf("Enter number of elements: ");
    scanf("%d", &n);

    printf("Enter array elements:\n");
    for(int i = 0; i < n; i++) {
        scanf("%d", &arr[i]);

        if(arr[i] > 0)
            positive++;
        else if(arr[i] < 0)
            negative++;
        else
            zero++;
    }

    printf("Positive count = %d\n", positive);
    printf("Negative count = %d\n", negative);
    printf("Zero count = %d\n", zero);

    return 0;
}
