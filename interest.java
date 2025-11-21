
import java.util.Scanner;
public class interest {
    public static void main(String[] args) {
        int a,b,c;
        System.out.println("TO calculate the Simple Interest:::");
        Scanner sc = new Scanner(System.in);

        System.out.println("Put your princile Amount::");

        if(!sc.hasNextInt())
        {
            System.out.println("Invalid input! Please enter a NUMBER for principle.");
            return;
        }
         a=sc.nextInt();

        System.out.println("Put the Rate of Interest::");
        
        if(!sc.hasNextInt())
        {
            System.out.println("Invalid input! Please enter a NUMBER for Interest.");
            return;
        }
        b=sc.nextInt();

        System.out.println("Put the time ::");
       
        if(!sc.hasNextInt())
        {
            System.out.println("Invalid input! Please enter a NUMBER for time.");
            return;
        }
         c=sc.nextInt();

        int d;
        d=a*b*c/100;
        System.out.println("Simple Interest is::  "+    d);
    }
}
