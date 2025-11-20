import java.util.Scanner;

public class lcm_and_hcf {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first Number:");
        int num1 = sc.nextInt();

        System.out.println("Enter the second Number:");
        int num2 = sc.nextInt();

        int hcf = 1;

       
        for(int i = 1; i <= num1 && i <= num2; i++) {
            if(num1 % i == 0 && num2 % i == 0) {
                hcf = i;
            }
        }

        
        int lcm = (num1 * num2) / hcf;

        System.out.println("The HCF of the two numbers is: " + hcf);
        System.out.println("The LCM of the two numbers is: " + lcm);
    }
}
