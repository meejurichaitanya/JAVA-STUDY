import java.util.Arrays;
import java.util.Scanner;

public class Sum_easy {
   // https://leetcode.com/problems/two-sum/submissions/1527503200/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = new int[5];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = input.nextInt();
        }System.out.println(Arrays.toString(twoSum(nums,6)));

    }
            static int[] twoSum(int[] nums, int target) {

            for(int i=0;i<nums.length;i++){
                    for (int j= i+1;j<nums.length;j++) {
                        if((nums[i]+nums[j])==target){

                            return new int[]{i,j};
                        }
                    }

                }
                return null;
            }



}