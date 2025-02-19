import java.util.Arrays;

public class Cyclic {
    public static void main(String[] args) {
        int [] nums={5,4,3,2,1};
        cyclic_sort(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void cyclic_sort(int[] nums){
        //boolean At_correctPosition;
        int i=0;
        while (i<nums.length) {
            int correct_index=nums[i]-1;//the correct index of nums[i]=nums[i]-1;
            if (nums[i] != nums[correct_index]){
            //this is the check that where we check that if the nums[i] not in its correct index.then we will swap
                swap(nums,i,correct_index);
            }else {
                i++;
            }

        }
    }
    static void swap(int[] arr,int index1 ,int index2){
        int temp = arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
}