public class Power_Of_2 {
    public static void main(String[] args) {
        /*to check if the number is power of 2 or not:
        1. we know that the power of 2 will have only 1 in its MSB(Most
        Significant Bit).
       2^0= 1 → In binary: 0001 (MSB is 1)
       2^1=2 → In binary: 0010 (MSB is 2nd bit)
       2^2=4 → In binary: 0100 (MSB is 3rd bit)
       2^3=8 → In binary: 1000 (MSB is 4th bit)
       2^4=16 → In binary: 10000 (MSB is 5th bit)
        -->2^n =1 followed by n zeros

       2. we also know that the number preceding the 2^n9(i.e.,2^n-1) will
        have all ones in its binary bits.
               2^2=4-->4-1=3==in binary--> 11
               2^3=8-->8-1=7==in binary--> 111
               2^4=16-->16-1=15==in binary--> 1111......continues

               (2^n)-1--> Should have n ones



         */
        int n=1;
        //we can just do AND & operation for n & n-1 to find if it is a power
        //of two or not, if it is a power of 2 ,it will give the answer as 0,
        //otherwise it is not a power of 2.
          /*
            EXAMPLE:
                     10000   (16 in binary)
                   & 01111   (15 in binary)
                   --------
                     00000   (0 in binary)
           */
        if (n==0){
            System.out.println("false");
            return ;
        }
        boolean ispowerof2=(n&(n-1))==0;
        System.out.println(ispowerof2);

    }
}
