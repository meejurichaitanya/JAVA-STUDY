public class Reset_the_bit {
    public static void main(String[] args) {
      /*If we want to reset ith bit to 0.
      we can do AND with 0 to the ith bit then we can reset it.
      1.create a mask of n<<i and invert it ,inverting it gives all the
      bits as 1 except the ith bit then we can do AND with it to get
      the answer.
       */
        int num=7;//in binary=00000111(1 byte)
        int i=1;
        //reset ith bit
        System.out.println(num&~(1<<i));
    }
}
