import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str;
        int i, flag = 1;

        System.out.print("Enter a string: ");
        str = sc.next();   // reads single word

        int len = str.length();

        for (i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - i - 1)) {
                flag = 0;
                break;
            }
        }

        if (flag == 1)
            System.out.println("Palindrome string");
        else
            System.out.println("Not a palindrome string");

        sc.close();
    }
}
