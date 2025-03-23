public class My_Try {
    public static void main(String[] args) {
        pattern(3);

    }
    static void pattern(int n){
        //assume no.of rows will be starting from 1 to <-=n
        //same no.cols will be starting from 1<=row
        helper(1,1,n);
    }
    static void helper(int row,int col,int n){
        if (row>n){
            return;
        }
        if (col<=row){
            System.out.print("*"+" ");
            helper(row, col+1, n);
        }else {
            System.out.println();
            helper(row+1,1,n);
        }
    }
    /*
    don't panic its nothing , we are saying like first check if the current
    column is < row , if it is just print the "*" and call next function to print
    same row but column+1.
    When the column is greater than row , that means we have printed all the cols in
    that particular row. So just print a new line and call next function to print
    in row+1, column will be starting from 1.
     */
    //for reverse triangle
    /*
    static void helper2(int row,int col,int n){
        if (row>n){
            return;
        }
        if (col<=row){
            helper2(row, col+1, n);
            System.out.print("*"+" ");

        }else {
            helper2(row+1,1,n);
            System.out.println();

        }
    }

     */
}
