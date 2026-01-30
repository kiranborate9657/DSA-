#include <stdio.h>

int main() {
    char str[100];

    printf("Enter a string: ");
    fgets(str, sizeof(str), stdin);

    // Check if string is empty or only newline
    if (str[0] == '\n' || str[0] == '\0') {
        printf("String is empty");
    } else {
        printf("String is not empty");
    }

    return 0;
}
