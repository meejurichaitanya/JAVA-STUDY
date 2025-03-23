public class Majority_element {
    public static void main(String[] args) {
        int[] nums={2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));


    }
    static int majorityElement(int[] nums) {
        for(int i =0;i<nums.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(nums[j]<nums[j-1]){
                    int temp =nums[j];
                    nums[j]=nums[j-1];
                    nums[j-1]=temp;
                }else break;
            }
        }
        //sorting has done
        int majority=nums.length/2;
        int majority_element=0;
        int count=1;
        for(int k=1;k<nums.length;k++){
            if(nums[k]==nums[k-1]){
                count =count+1;
                if(count>majority){
                    majority_element=nums[k];
                }
            }else count =1;
        }
        return majority_element;

    }
}
