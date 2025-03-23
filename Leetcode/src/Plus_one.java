import java.util.Arrays;

public class Plus_one {
    public static void main(String[] args) {
        //https://leetcode.com/problems/plus-one/
        /*
        Input: digits = [1,2,3]
        Output: [1,2,4]
        Explanation: The array represents the integer 123.
        Incrementing by one gives 123 + 1 = 124.
        Thus, the result should be [1,2,4].
         */
        int[] digits={9};
        System.out.println(plusOne(digits));
       /*
       Java automatically add zeroes
       int[] example=new int[3];
        example[0]=1;
        System.out.println(Arrays.toString(example)); */

    }
    static int[] plusOne(int[] digits) {
        int n=digits.length-1;
        for(int i=n; i >= 0; i--){
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }else digits[i]=0;
        }
        //if the program comes here that mean all numbers are 9
        int[] new_number=new int[n+1];
        new_number[0]=1;
        return new_number;
    }

}
