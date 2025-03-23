public class MaxAscSubarray {
    public static void main(String[] args) {
        int[] nums={10,20,30,5,10,50};
        maxAscendingSum(nums);
        System.out.println(maxAscendingSum(nums));

    }
    static int maxAscendingSum(int[] nums) {

        int maxsum=nums[0];
        int sum=nums[0];
        for(int i=1;i<nums.length;i++){

            if(nums[i]>nums[i-1]){
                sum=sum+nums[i];//+nums[i-1];
                maxsum=Math.max(sum,maxsum);
            }else {

                sum = nums[i];
            }
        }
        return maxsum;

    }


}

