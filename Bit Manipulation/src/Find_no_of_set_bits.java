public class Find_no_of_set_bits {
    public static void main(String[] args) {
        /*we know we can get the LSB by doing AND(&) the number with
        same negative number.

         */
        int n=354;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(Integer.toBinaryString(n-1));

       int count=0;
       /* while (n>0){
            if((n&-n)==1){
                count++;
            }
            n=n>>1;

        }
        System.out.println(count); */

        while (n>0){
            count++;
            n=n&(n-1);
        }
        System.out.println(count);

    }
}
