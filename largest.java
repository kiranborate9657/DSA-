
import java.util.Scanner;
public class largest {
    
    public static void main(String[] args) {
        int a,b;
       // int result=0;
        System.out.println("Enter the first Number:");
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        System.out.println("Enter the Second Number:");
        b=sc.nextInt();
        if(a<b)
        {
           // result=b;
            System.out.println("Large number is::  "+b);
        }
        else if(a>b)
        {
            System.out.println("Large number is::  "+a);
        }
        else if(a==b)
         {
            System.out.println("Number is Equal:");

        }
       



        
    }
}
