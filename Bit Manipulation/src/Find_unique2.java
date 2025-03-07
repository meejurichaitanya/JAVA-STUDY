public class Find_unique2 {
    public static void main(String[] args) {
        /*finding the unique number when there are more than 2 repeated elements
        like if we have 2 repeated elements and 1 unique element we can do XOR and eliminate
        all the repeated elements.
        1.if we have even number of repeated elements we can eliminate them by doing XOR operation
         like 2, 4, 6..
        2.but when we have odd number of repeated elements that approach will not work we have
        different approach.
        step1:for each bit position(like 0th,1st,2nd...<32- because int can have 31 bits 0 to 31)
              count the frequency of set bits occurred in each position--> EXAMPLE: like if you have 3,3,3
              in binary 3-111 so at all oth,1st,2nd bit positions the number have set bits of 1 , we have
              total 3 bits of number 3 so at every bit position these numbers have 3 set bits .
              In short we have to count the total number of set bits occurred at each bit position
              of every number in the array.
        step2:if total number of set bits % number of repeated elements given in array
              not equal to zero.we have to do OR operation with result and bit mask.

            -->sum % 3 == 0:
               🔹 The bit belongs to numbers that appeared exactly 3 times.
            -->sum % 3 == 1:
               🔹 The bit belongs to the unique number.

              we take bitmask as 1<<i. i starts from 0.
         */
        int[] arr = {3, 4, 2, 3, 3, 4, 4,};
        System.out.println(find_unique(arr));
    }

    static int find_unique(int[] nums) {
        int result =0;//initially
        for (int i = 0; i < 32; i++) {
            //here we take 32 because int have max of 31 bits from 0 to 31.
            int sum = 0;
            int bitmask=1<<i;
            //we first start counting of set bits from 0th index so bitmask is initialized like that
            //for every position ++ bit mask also left shift <<+1.
            for (int num:nums){
               if ((num&bitmask)!=0){
                   //here we check a number like example: 1&1== binary 00000001&00000001=1
                   sum++;
               }
            }
            if (sum%3!=0){//this only works when sum%3!=0;
                result=result|bitmask;
            }

        }
        return result;
    }
}
