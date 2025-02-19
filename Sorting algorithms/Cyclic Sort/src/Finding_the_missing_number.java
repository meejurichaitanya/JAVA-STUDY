import java.util.Arrays;

public class Finding_the_missing_number {
    public static void main(String[] args) {
      //  https://leetcode.com/problems/missing-number/
        //amazon question
        int[]nums={3,2,4,0};

        System.out.println(find_missing_value(nums));


    }
    static int find_missing_value(int[] arr){
        CyclicSort(arr);
        for (int i = 0; i <arr.length ; i++) {
            if (i!=arr[i]){
                return i;
            }

        }
        return arr.length;// when all the elements in the array are present from 0 to n-1
        //that means the missing element is n only
    }
    static void CyclicSort(int[] arr){
        //here the range is starting from 0 to n.where n is the size of the array,we have to find the missing value
        //so first we are sorting the array
        //here the range starts from zero,so the correct index will be the value itself
        //if the value is 0 then the correct index for it will be 0 as well.
        int i=0;
        while(i<arr.length) {      //that means the i starts from 0 and and it will be less than the length of the array.
            int correct_index = arr[i];  //for nums[i] correct index will be nums[i] here;
             if (arr[i]<arr.length&&arr[i]!=arr[correct_index]){
                 //we took arr[i] should less than nums.length because if an element is equal to the
                 //length of the array then the element should not have the correct index, because we are taking
                 //from the range 0, so an extra element is already there then ,it can take upto 4 elements only,if the
                 swap(arr,i,correct_index);
             }
             else i++;
        }
    }
    static void swap(int[]nums, int index1, int index2){
        int temp=nums[index1];
        nums[index1]=nums[index2];
        nums[index2]=temp;
    }
}
