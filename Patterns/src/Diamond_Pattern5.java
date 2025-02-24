public class Diamond_Pattern5 {
    public static void main(String[] args) {
        /*

         */
        pattern(5);

    }
    static void pattern(int n){
        for (int row = 1; row <=2*n-1 ; row++) {
            int total_cols;
            if (row>n){
                total_cols=2*n-row;
            }else total_cols=row;
            int total_spaces=n-total_cols;



            for (int spaces = 1; spaces <=total_spaces ; spaces++) {
                System.out.print(" ");

            }

            for (int cols = 1; cols <=total_cols ; cols++) {
                System.out.print("* ");

            }
            System.out.println();

        }

    }
}
