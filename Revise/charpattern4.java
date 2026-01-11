import java.util.Scanner;
public class charpattern4 {
    public static void main(String[] args) {
        System.out.println("Enter the required number: ");
        Scanner sc=new Scanner(System.in);
        int num;
        num=sc.nextInt();
        for(int i=1;i<=num;i++)
        {
            for(int s=1;s<=0+i;s++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=num-i;j++)
            {
                System.out.print((char)('A'+j-1)+" ");
            }
            System.out.println();

        }
    }
}
