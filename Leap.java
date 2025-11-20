
import java.util.Scanner;
public class Leap {
    public static void main(String[] args) {
        int a;
        System.out.println("Enter the Year for the identify it is leap or not::");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        if(a%400==00)
        {
            System.out.println("Inserted year is the Leap:");
        }
        else if(a%100==00)
        {
            System.out.println("Inseted year is not Leap");
        }
        else if(a%4==0)
        {
            System.out.println("THis year is Leap year:");
        }
        else 
        {
            System.out.println("This year is not Leap year:");
        }


    }
    
}
