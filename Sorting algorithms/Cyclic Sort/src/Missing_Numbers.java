import java.util.ArrayList;

public class Missing_Numbers {
    //https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/
    public static void main(String[] args) {
        int[] nums={4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(nums));

    }
    static ArrayList<Integer> findDisappearedNumbers(int[] nums) {
        cyclicsort(nums);
        ArrayList<Integer> ans=new ArrayList<>();
        for(int index=0;index<nums.length;index++){
            if(nums[index]!=index+1){
                ans.add(index+1);
            }
        }
        return ans;

    }
    static void cyclicsort(int[] nums){
        int i=0;
        while(i<nums.length){
            int correctindex=nums[i]-1;
            if(nums[i]!=nums[correctindex]){
                swap(nums,i,correctindex);
            }else i++;
        }
    }
    static void swap(int[] nums, int index1, int index2){
        int temp=nums[index1];
        nums[index1]=nums[index2];
        nums[index2]=temp;
    }
}
