public class k_pattern {
    public static void main(String[] args) {
        for (int i = 4; i >= 1; i -= 2) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Middle line
        System.out.println("*");

        // Lower part
        for (int i = 2; i <= 4; i += 2) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
