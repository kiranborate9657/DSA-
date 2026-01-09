import java.util.Scanner;

public class pattern9 {
    public static void main(String[] args) {
        System.out.println("Enter the Row number: ");
        Scanner sc=new Scanner(System.in);
        int row;
        row=sc.nextInt();
        for(int i=1;i<=row;i++)
        {
            for(int j=1;j<=row-i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        
    }
}
