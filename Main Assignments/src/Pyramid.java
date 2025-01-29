public class Pyramid {
    public static void main(String[] args) {
        int n = 5; // Number of rows in the pyramid

        // Outer loop for rows
        for (int i = 1; i <= n; i++) {
            // Inner loop for spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Inner loop for stars
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print("*");
            }
            // Move to the next line
            System.out.println();
        }
    }
}

