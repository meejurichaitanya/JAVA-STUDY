public class Pattern6 {
    public static void main(String[] args) {
        /*
            1
          2 1 2
        3 2 1 2 3
      4 3 2 1 2 3 4
    5 4 3 2 1 2 3 4 5

         */
        pattern(5);
    }
    static void pattern(int n){
        for (int row = 1; row <=n ; row++) {
            for (int spaces = 1; spaces <=n-row ; spaces++) {
                System.out.print("  ");

            }
            for (int cols = row; cols >=1 ; cols--) {
                System.out.print(cols+" ");

            }
            for (int cols2 = 2; cols2 <=row ; cols2++) {
                System.out.print(cols2+" ");

            }
            System.out.println();

        }
    }
}
