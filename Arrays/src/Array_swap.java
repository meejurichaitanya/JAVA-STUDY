import java.util.Arrays;

public class Array_swap {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        reverse_arr(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void reverse_arr(int[]arr){
        int start=0;
        int end =arr.length-1;
        while (start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
    static void swap(int[]arr,int start,int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
}
