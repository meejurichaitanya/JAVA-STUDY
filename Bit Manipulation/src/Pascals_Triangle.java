public class Pascals_Triangle {
    public static void main(String[] args) {
        //find the sum of the nth row of the pascal's triangle.
        //the sum of nth row of pascal's triangle is 2powerN-1(2^n-1)
        //where n is the row number.
        /*
        Row 0:    1
        Row 1:   1  1
        Row 2:  1  2  1
        Row 3:  1  3  3  1
        Row 4:  1  4  6  4  1
         */
        int n=3;
        int sum= (int)(Math.pow(2,n));
        System.out.println(sum);
    }
}
