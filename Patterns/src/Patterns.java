import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {
        /*
        There are three steps you need to follow while doing every pattern
        1.Identify the no of rows and run the outer loop=no.of rows
        2.Identify for each row how many cols are there and run the inner loop
          for the cols.
          Note:Find the formula for relating rows and cols
        3.Identify what you want to print
         */
        Scanner input= new Scanner(System.in);
        pattern1(5);
    }
    static void pattern1(int n){
        for (int row = 1; row <=n ; row++) {
            for (int col = 1; col <=row ; col++) {
                System.out.print("* ");

            }
            System.out.println();

        }
    }
}