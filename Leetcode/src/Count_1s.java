public class Count_1s {
    public static void main(String[] args) {
        int[] nums={1,1,0,1,1,1};
        int sum=0;
        int maxsum=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                sum=sum+1;
                maxsum=Math.max(sum,maxsum);

            }else sum =0;



        }
        System.out.println( maxsum);

    }

}
