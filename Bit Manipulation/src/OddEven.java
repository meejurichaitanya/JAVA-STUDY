public class OddEven {
    public static void main(String[] args){
        int num=4541;
        /*for finding odd or even ?we know that in cs every number internally
        stored in a binary format.
        1.if the LSB(least significant bit)of num  is 1 then num=ODD
        2.if the LSB(least significant bit)of num is 0 then num=even
        Because, it is the bit that determines whether a nu is even or odd
        if the lsb is 1 then 1*2^0=1 therefore this 1 will be added to the
        total even number then it became as odd  if even+1=odd.(we know except
        LSB(2^0=1) bit, every bit gives us even like 2^1=2, 2^2=4, 2^3=8, 2^4=16....
        so we consider the lsb bit.
        BUT HOW TO FIND THE LSB IS 1 OR 0:
          1.we know that every num we do AND with 1 it will result the same
          number.
            ex:0&1=0, 1&1=1 like that
           So, if we want to find the lSB we should just have to do the LSB &1.

         */
        System.out.println(isOdd(num));

    }
    static boolean isOdd(int num){
        return ((num&1)==1);
    }
}