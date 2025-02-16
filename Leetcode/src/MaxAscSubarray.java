public class MaxAscSubarray {
    public static void main(String[] args) {
        int[] nums={10,20,30,5,10,50};
        maxAscendingSum(nums);
        System.out.println(maxAscendingSum(nums));

    }
    static int maxAscendingSum(int[] nums) {

        int maxsum=0;
        int sum=0;
        for(int i=1;i<nums.length;i++){

            if(nums[i]>nums[i-1]){
                sum=sum+nums[i]+nums[i-1];

            }else {
                maxsum = Math.max(sum, maxsum);
                sum = 0;
            }
        }
        return maxsum;

    }
}

