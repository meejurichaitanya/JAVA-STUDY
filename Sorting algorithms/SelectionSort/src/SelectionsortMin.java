import java.util.Arrays;

public class SelectionsortMin {
    public static void main(String[] args) {
        int[] arr={3,4,2,5,17,6};
        selectionsortMin(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionsortMin(int[] arr){
        for (int i = 0; i < arr.length ; i++) {
            int firstIndex =i;
            int lastIndex=arr.length-1;
           int  minvalue=findmin(arr,firstIndex,lastIndex);
           swap(arr, firstIndex,minvalue);

        }
    }
    static int findmin(int[] arr,int start,int end){
        int min=start;
        for(int i=start;i<=end;i++){
            if (arr[i]<arr[min]){
                min=i;
            }
        }
        return min;
    }
    static void swap(int[] nums,int index1, int index2 ){
        int temp=nums[index1];
        nums[index1]=nums[index2];
        nums[index2]=temp;
    }
}