public class pattern8 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++)
        {
            for(int s=1;s<=6+i;s++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=6-i;j++)
            {
                System.out.print(" *");
            }
            System.out.println();
        }


        for(int i=1;i<=4;i++)
        {
            for(int s=1;s<=11-i;s++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=1+i;j++)
            {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
