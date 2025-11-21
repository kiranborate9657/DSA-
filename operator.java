
import java.util.Scanner;
public class operator {
    public static void main(String[] args) {
       int a,b;
       char c;
       int result;
       System.out.println("Enter the two number::");
       Scanner sc = new Scanner(System.in) ;
       System.out.println("Eneter the first Number:");
       a=sc.nextInt();
       System.out.println("Enter the Second Number:");
       b=sc.nextInt();
       System.out.println("Eneter the Sign you want to +,*,/,-  ");
       c=sc.next().charAt(0);
       if(c=='+')
       {
         result=a+b;
       }
       else if(c=='-')
       {
        result=a-b;
       }
       else if(c=='*')
       {
        result=a*b;
       }
       else if(c=='/')
       {
        result=a/b;
       }

        else {
             System.out.println("Invalid Operator!");
             return;  
         }
       System.out.println("Result of  the Operation is::  "+ result);

    }
}
