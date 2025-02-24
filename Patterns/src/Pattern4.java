public class Pattern4 {
    public static void main(String[] args) {
              /*
               *
               **
               ***
               ****
               *****
               ****
               ***
               **
               *
               */
        pattern(5);
    }
    static void pattern(int n){
        for (int row = 1; row <=2*n-1 ; row++) {
            int col_run;
            if (row>n){
                 col_run=2*n-row;
            }else col_run=row;
            for (int col = 1; col <=col_run ; col++) {
                System.out.print("* ");

            }
            System.out.println();

        }
    }
}
