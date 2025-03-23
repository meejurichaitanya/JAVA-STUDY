public class QuickSort {
    public static void main(String[] args) {
        int[] nums={8,6,7,5,4,3,2,1};
        quick_sort(nums,0,nums.length-1);
    }
    static void quick_sort(int[] arr, int low, int high){
        if (low>=high){
            return;
        }
        int start=low;
        int end=high;
        int mid=start+(end-start)/2;
        int pivot=arr[mid];


        /*when start is greater than end the while will break ,that means all
        the elements smaller than pivot are placed in left hand side of pivot and
        all the elements that are greater than pivot are placed in the right hand
        side of pivot, which means the partition has done.
         */
        while(start<=end){

            while(arr[start]<pivot){
                start++;
              //this while condition ensures that arr[start] is less than pivot which means it is in left hand side of pivot and also less than pivot
             //When this while loop breaks that mean arr[start] is not less than pivot so we have to swap it.
            }
            while (arr[end]>pivot){
              end--;
              //This while loop runs when the element at arr[end] is > pivot ,that mean it is already >pivot and it is on RHS of pivot
              //When this while loop breaks that mean the element at the arr[end] is less than pivot , so we have to swap it .
            }
            /*After the violation of both above loops that mean the start index have the element that is greater than pivot
            and the end index have the element that is less than pivot.
            SO WE NEED TO SWAP THEM.
             */
            //SWAP:
            if (start<=end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
            /*, the condition s <= e ensures that elements are swapped only when
             the two pointers (s and e) haven't crossed each other yet.
             */
        }
        //partitioning is done now we have to call next calls for partitioning
        //the two halves LHS and RHS of pivot.
        quick_sort(arr,low,end);
        quick_sort(arr,start,high);
    }
}