 import java.util.*;

public class Quick_sort_practice {
    public static void main(String[] args) {
        int[] arr={7,6,5,4,3,2,1};
        quicksort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void quicksort(int[] arr, int low, int high){
        /*we will return when low==high because when low==high, we don't have to
        check because its already in its correct position
         */
        if (low>=high){
            return ;
        }
        int start=low;
        int end =high;
        int mid=(start+end)/2;
        int pivot=arr[mid];
        while (start<=end){

            while (arr[start]<pivot){
                start++;
            }
            while (arr[end]>pivot){
                end--;
            }
            if (start<=end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
        quicksort(arr,low,end);
        quicksort(arr,start,high);

    }
}
