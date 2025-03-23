import java.util.Arrays;

public class Selection_sort_min {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        selectionsort(arr,0,arr.length-1,0);
        System.out.println(Arrays.toString(arr));

    }
    static void selectionsort(int[] nums,int minindex , int col, int min){
        if (minindex==nums.length-1){
            return;
        }
        if (col>minindex){
            if (nums[col]<nums[min]){
                selectionsort(nums, minindex, col-1, col);
            }else selectionsort(nums, minindex, col-1, min);
        }else {
            int temp=nums[minindex];
            nums[minindex]=nums[min];
            nums[min]=temp;
            selectionsort(nums,minindex+1,nums.length-1,minindex+1);
        }

    }
}
