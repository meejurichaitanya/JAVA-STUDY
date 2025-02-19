import java.lang.reflect.Array;
import java.util.ArrayList;

public class FindAllDuplicates {
    public static void main(String[] args) {
        int[] nums={4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(nums));


    }
    static ArrayList<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> ans=new ArrayList<>();
        sort(nums);
        for(int i=0; i<nums.length;i++){
            if(nums[i]!=i+1){
                ans.add(nums[i]);
            }
        }
        return ans;

    }
    static void sort(int[] nums){
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
