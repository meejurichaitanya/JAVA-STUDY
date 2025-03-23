import java.util.Arrays;

public class MergeSort_Inplace {
    public static void main(String[] args) {
        int[] nums={5,6,4,3,2,1,};
        mergeInplace(nums,0,nums.length);
        System.out.println(Arrays.toString(nums));

    }
    static void mergeInplace(int[] arr,int start, int end ){
        if (end-start==1){
            return;
        }
        int mid=start+(end-start)/2;
        mergeInplace(arr, start, mid);
        mergeInplace(arr, mid, end);
        merge(arr,start,mid,end);
    }
    static void merge(int[] arr, int start, int mid, int end){
        int[] mix=new int[end-start];
        int i=start;
        int j=mid;
        int index=0;

        while (i<mid&&j<end){
            if (arr[i]<arr[j]){
               mix[index]=arr[i];
               i++;
                index++;
            }else{
                mix[index]=arr[j];
                j++;
                index++;
            }

        }
          /*there may be conditions when the above while loop is terminated
        there may be still a chance where some elements will be remained
        in any one of both arrays.*/
        while (i<mid){
            mix[index]=arr[i];
            i++;
            index++;
        }
        while (j<end){
            mix[index]=arr[j];
            j++;
            index++;
        }
        for (int l = 0; l < mix.length ; l++) {
            arr[start+l]=mix[l];

        }
    }
}
