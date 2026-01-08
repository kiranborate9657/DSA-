public class pattern7 {
    public static void main(String[] args) {
        for (int i = 6; i >= 1; i--) {

            // print spaces
            for (int space = 0; space < 6 - i; space++) {
                System.out.print(" ");
            }

            // print stars
            for (int star = 1; star <= i; star++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        // Lower half (increasing stars)
        for (int i = 2; i <= 6; i++) {

            // print spaces
            for (int space = 0; space < 6 - i; space++) {
                System.out.print(" ");
            }

            // print stars
            for (int star = 1; star <= i; star++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
