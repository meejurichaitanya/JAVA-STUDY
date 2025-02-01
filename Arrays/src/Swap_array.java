import java.util.Arrays;

public class Swap_array {
    public static void main(String[] args) {
        int[] numbers={1,2,3,4,5,6,7,8,9,};
        System.out.println(Arrays.toString(numbers));
        reverse_array(numbers);
        System.out.println(Arrays.toString(numbers));
    }
    static void swap(int[] arr,int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    static void reverse_array(int[] arr){
        int start=0;
        int end=arr.length-1;
        while (start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
}
