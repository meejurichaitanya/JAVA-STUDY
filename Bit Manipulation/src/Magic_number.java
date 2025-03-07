public class Magic_number {
    public static void main(String[] args) {
        /*
        MAGIC NUMBER: magic number is a number in bit manipulation that is
        formed by summing the powers of 5.the binary representation of the
        integer will decide which powers of 5 should be summed.(That means all
        the powers in the set bits will be summed.)
        for example:num=3, 3 in binary--> 00000011, starting from lsb , we do
         -->LSB*5^1+secondLSB*5^2+thirdLSB*5^3....it goes until the number not equal
         to zero.
         So here, 011 == 0*5^3+01*5^2+1*5^1 ==30.
         STEPS:First we do & the number with 1 , so that we can get the LSB.
           -->the we do ans = LSB*base.
          -->we take the base starting as 5 and we gradually increase the base into
          base=base*5(it means for every loop the one extra 5 is added which results in like
          increasing the power of 5 with each next bit.
         */
        int num=3;
        System.out.println(magicnumber(num));

    }
    static int magicnumber(int num){
        int ans =0;
        int base =5;
        while (num!=0){
            int LSB=num&1;
            num=num>>1;
            ans= ans+(LSB*base);
            base=base*5;
        }
        return ans;
    }
}
