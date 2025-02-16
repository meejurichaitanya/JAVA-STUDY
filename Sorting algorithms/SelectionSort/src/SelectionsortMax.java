import java.util.Arrays;

public class SelectionsortMax {
    public static void main(String[] args) {
        int[] arr={54,5,2,7,3,6,3,73,32};
        selectionsortMax(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionsortMax(int[] nums){
        for (int i = 0; i < nums.length ; i++) {
            int lastIndex= nums.length-1-i;
            int max=findmax(nums,0,lastIndex);
            swap(nums,lastIndex,max);

        }
    }
    static int findmax(int[] arr,int start, int end){
        int max=start;
        for (int i = start; i <=end ; i++) {
            if (arr[i]>arr[max]){
                max=i;
            }

        }
        return max;
    }
    static void swap(int[] arr,int index1,int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
}
