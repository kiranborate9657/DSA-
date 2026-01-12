public class numberpattern {
    public static void main(String[] args) {
         for (int i = 1; i <= 7; i++) {

            for (int s = 1; s <= Math.abs(4 - i); s++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 7 - 2 * Math.abs(4 - i); j++) {
                System.out.print(i);
            }

            System.out.println();
        }
    }
}
