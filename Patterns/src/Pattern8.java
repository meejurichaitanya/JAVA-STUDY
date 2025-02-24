public class Pattern8 {
    public static void main(String[] args) {
        pattern(5);
        /*
         4 4 4 4 4 4 4
         4 3 3 3 3 3 4
         4 3 2 2 2 3 4
         4 3 2 1 2 3 4
         4 3 2 2 2 3 4
         4 3 3 3 3 3 4
         4 4 4 4 4 4 4
         */
    }
    static void pattern(int n){
        n=2*n;
        for (int row = 1; row<n ; row++) {
            for (int col = 1; col <n ; col++) {
                int min=Math.min(Math.min(row,col),Math.min(n-row,n-col));
                System.out.print(min+" ");

            }
            System.out.println();

        }
    }
}
