#include <stdio.h>

int main() {
    char str[100], rev[100];
    int i, length = 0;

    printf("Enter a string: ");
    fgets(str, sizeof(str), stdin);

    // Find length (ignore newline)
    for (i = 0; str[i] != '\0'; i++) {
        if (str[i] != '\n')
            length++;
    }

    // Reverse string
    for (i = 0; i < length; i++) {
        rev[i] = str[length - 1 - i];
    }
    rev[length] = '\0';

    printf("Reversed string: %s", rev);

    return 0;
}
