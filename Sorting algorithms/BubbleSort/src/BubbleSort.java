import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[]nums={5,4,3,2,1};
        sort(nums);
        System.out.println(Arrays.toString(nums));

    }
    static void sort(int[] arr){
        boolean swapped;
        for (int i = 0; i <arr.length-1 ; i++) {
             swapped=false;
            for (int j = 1; j <arr.length-i ; j++) {
                if (arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                    swapped=true;
                }

            }
            if (!swapped){
                break;
            }

        }
    }
    static void swap(int[] arr, int index1,int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
}