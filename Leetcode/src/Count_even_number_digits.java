public class Count_even_number_digits {
    public static void main(String[] args) {
           int[] arr={1,232,23,3434,2132,121};

           System.out.println(findNumbers(arr));
     }

    static int findNumbers(int[]nums) {
        int count =0;
        for(int i=0;i<nums.length;i++){
            if(is_even_digits(nums[i])){
                count++;
            }
        }

        return count;
    }
    static boolean is_even_digits(int num) {
        String str = Integer.toString(num);
        if (str.length() % 2 == 0) {
            return true;
        }
        return false;
    }
}

