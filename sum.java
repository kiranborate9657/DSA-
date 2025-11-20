import java.util.Scanner;

public class sum {


    public static void main(String[] args) {
        int a;
        System.out.println("Enter the number for the sum:::");
         Scanner sc =new Scanner(System.in);
         String in;
         int sum=0;
        while(true){
            in=sc.next();
            if(in.equals("x")){
                break;
            }else{
                int inputNum=Integer.parseInt(in);
                sum=sum+inputNum;
            }

        }
        System.out.println(sum);


    }
    
}
