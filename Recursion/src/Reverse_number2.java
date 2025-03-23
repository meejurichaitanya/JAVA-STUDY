public class Reverse_number2 {
    public static void main(String[] args) {
        int num =2316;
        System.out.println(reverse_num(num));

    }
    static int reverse_num(int n){
        if (n%10 ==n) {
            return n;
        }
        int digits=(int)(Math.log10(n))+1;
        /*
        this is the formula for finding no of digits in a number at that
         particular base.
         integer value of (log a/log b)+1==integer value of
         */
        int rem=n%10;
        return (int)(rem*Math.pow(10,digits-1)+reverse_num(n/10));
    }
}
