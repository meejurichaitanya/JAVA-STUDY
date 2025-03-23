import java.util.Arrays;

public class SelectionSort_Kunal {
    public static void main(String[] args) {
        int[] nums={5,4,3,2,1};
        selectionSort(nums, nums.length-1,1,0);
        System.out.println(Arrays.toString(nums));

    }
    static void selectionSort(int[] arr,int row, int col, int max){
        if (row==0){
            return;
        }
        /*
        here we are taking col<=row because we have to check last element also like
        is it greater than max are not.
        but before we used only col<row because there we only check col>col+1 like that,
        which means the last index is also checked by last call.
         */
        if (col<=row){
            if(arr[col]>arr[max]){
                //here if the current col has greater number than our max we update
                //max as current col and we will pass it to next function call which checks next element(col+1).
              selectionSort(arr, row, col+1, col);
              //otherwise just check the next col with max as same
            }else selectionSort(arr, row, col+1, max);
        }else{
            /*this condition works when col>row, which means all the elements are
            checked in the array and max element is found , therefore we can swap
            the max value  with the max index(row).
             */
            int temp=arr[row];
            arr[row]=arr[max];
            arr[max]=temp;
            /*
            this last call will call the next call which finds the next largest element
            in the array and swaps it with max element in the array.
            this process will continue until we row==0, when row==0 it means it is the
            remaining element in the array that is not swapped , so we can directly return
            without any further steps.
             */
            selectionSort(arr, row-1, 1, 0);
        }
    }
}
