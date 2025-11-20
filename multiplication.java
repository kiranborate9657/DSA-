
import java.util.Scanner;
public class multiplication {
    public static void main(String[] args) {
        System.out.println("Enter the number to create the Table :");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.println(a+ "*" +i+"="+a*i);
        }

       

    }
    
}
