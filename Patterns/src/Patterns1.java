import java.util.Scanner;

public class Patterns1 {
    public static void main(String[] args) {
        /*
         *****
         *****
         *****
         *****
         *****
         */
        Scanner input =new Scanner(System.in);
        pattern(5);
    }
    static void pattern(int n){
        for (int row = 1; row <=n ; row++) {
            for (int col = 1; col <=n ; col++) {
                System.out.print("*");
                
            }
            System.out.println();
            
        }
    }
}
