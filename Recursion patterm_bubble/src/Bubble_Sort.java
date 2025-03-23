import java.util.Arrays;

public class Bubble_Sort {
    public static void main(String[] args) {
        int[] nums={1,2,3,9,8,6,7};
        Bubble2(nums,nums.length-1,0);
        System.out.println(Arrays.toString(nums));

    }

    //kunal's approach
    static void Bubble2(int[] arr, int row,int col){
        if (row==0){
            return;
        }

        if (col<row){
            if (arr[col]>arr[col+1]){
                swap(arr, col, col+1);
            }
            Bubble2(arr, row, col+1);
        }else {
            Bubble2(arr, row-1, 0);
        }
        /*col<row means that the index is less than the maximum length of current
        pass or not, i mean whenever you reach col==row you can't make further check
        like arr[col]>arr[col+1] or not like that , it is not possible when we
        reach last index(col) in the array
        -->Here col means index position.
        -->row means length(range) of that particular pass(iteration)
        *at first pass the length of row is arr.length-1(last index of array)
          therefore col will keep checking till col==row-1, whenever col==row,
          that means we have check and swapped all the elements and now the largest
          element in the array is at the last place of the array.
         */

    }
    static void swap(int[] arr, int index1, int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }

    /*
      static void BubbleSort(int[] arr){
        helper(arr,arr.length,1);
    }
    //this is my approach
    static void helper(int[] arr,int length,int index){
        if (length==1){
            return;
        }
        if (index<length){
            if (arr[index]<arr[index-1]){
                swap(arr,index,index-1);

            }
            helper(arr,length,index+1);
        }else {
            helper(arr, length-1, 1);
        }
    }
     */
}
