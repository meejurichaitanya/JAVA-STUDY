import java.util.Arrays;

public class Selection_Sort {
    public static void main(String[] args) {
        int[] nums={5,4,3,2,1};
        selection_Sort(nums,nums.length-1);
        System.out.println(Arrays.toString(nums));

    }
    static void selection_Sort(int[] arr,int end){
        if (end==0){
            return;
        }
        int max=findmax(arr,0,end);
        swap(arr,max,end);
        selection_Sort(arr, end-1);

    }
    static int findmax(int[] arr, int start,int end){
        int max=start;
        for(int i=start;i<=end;i++){
            if (arr[i]>arr[max]){
                max=i;
            }
        }
        return max;
    }
    static void swap(int[] arr, int index1, int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
}
