public class Pattern7 {
    public static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n){
        for (int row = 1; row <=2*n-1 ; row++) {
            int S_cols;
            if (row>n){
                S_cols=2*n-row;
            }else S_cols=row;
            for (int Spaces = 1; Spaces <=n-S_cols ; Spaces++) {
                System.out.print("  ");
            }
            for (int cols = S_cols; cols>=1 ; cols--) {
                System.out.print(cols+" ");

            }
            //this loop is for after reoccur colums.
            for (int cols = 2; cols <=S_cols; cols++) {
                System.out.print(cols+" ");

            }
            System.out.println();

        }
    }
}
