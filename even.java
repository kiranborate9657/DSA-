
import java.util.Scanner;
public class even {
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        int a;

        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        if(a%2==0)
        {
            System.out.println("The number is Even");
        }
        else {
            System.out.println("THe given number is ODD");
        }

    }
}
