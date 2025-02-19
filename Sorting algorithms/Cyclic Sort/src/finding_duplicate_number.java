import java.util.ArrayList;

public class finding_duplicate_number {
    public static void main(String[] args) {
        int[] nums={4,3,2,7,5,3,1};
        System.out.println(findDuplicates(nums));

    }
    static int findDuplicates(int[] nums) {
        int i=0;

        while(i<nums.length){
            if(nums[i]!=i+1){
                int correctindex=nums[i]-1;
                if(nums[i]!=nums[correctindex]){
                    swap(nums,i,correctindex);
                }else{
                    return nums[i];
                }
            }else{
                i++;
            }
        }
        return -1;

    }
    static void swap(int[] nums, int index1, int index2){
        int temp=nums[index1];
        nums[index1]=nums[index2];
        nums[index2]=temp;
    }
}
