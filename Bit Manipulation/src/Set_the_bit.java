public class Set_the_bit {
    public static void main(String[] args) {
        /* here we hae to set the ith bit in a number
        1.To set the ith bit you have to create a bit mask W.R.T i with 1
        and we have to do the OR operation with it.
        1.we know OR operation with 1 sets the bit.
        -->if it is 0 convert it to 1.
        -->if it is 1 , it will be remained as 1.
         */
        int num=5;//in binary=00000101(1 byte)
        int i=1;
        //set bit
        System.out.println(num|1<<i);
    }
}
