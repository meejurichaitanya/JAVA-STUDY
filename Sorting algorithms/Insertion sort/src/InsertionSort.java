import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] nums={9,4,6,4,72};
        Insertionsort(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void Insertionsort(int[] arr){
        for (int i=0;i< arr.length-1;i++){
            for (int j = i+1; j >0 ; j--) {
                if (arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }

            }
        }
    }
    static void swap(int[] nums, int index1, int index2){
        int temp=nums[index1];
        nums[index1]=nums[index2];
        nums[index2]=temp;
    }
}