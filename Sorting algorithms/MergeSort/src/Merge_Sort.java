import java.util.Arrays;

public class Merge_Sort {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1,6,7};
        int[] ans =mergeSort(arr);
        System.out.println(Arrays.toString(ans));
        System.out.println(Arrays.toString(arr));

    }
    static int[] mergeSort(int[] arr){
        if (arr.length==1){
            return arr;
        }
        //here we are dividing the array by 2 to , divide it into two halves.
        int mid = arr.length/2;
        /*again we are doing the recursive call for each half to make each part
        is sorted ,whenever in the last call we get single element arrays back
        we merge them and we will send the merged array to above calls.
         */
        //it will take 0 to <mid
        int[] left=mergeSort(Arrays.copyOfRange(arr,0,mid));
        //it will take mid to <arr.length
        int[] right=mergeSort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left,right);
    }
    static int[] merge(int[] first, int[] second){
        int[] mix=new int[first.length+ second.length];
        int i =0;
        int j =0;
        int index=0;
        while (i< first.length && j < second.length){
            if (first[i]<second[j]){
                mix[index]=first[i];
                i++;
            }else{
                mix[index]=second[j];
                j++;
            }
            index++;
        }
        /*there may be conditions when the above while loop is terminated
        there may be still a chance where some elements will be remained
        in any one of both arrays.I mean it terminates the loop when
        i>=first.length and j>=second.length. So we have to deal with also
        lets see  how we can do that.
         */
        while (i< first.length){
            mix[index]=first[i];
            i++;
            index++;
        }
        while (j< second.length){
            mix[index]=second[j];
            j++;
            index++;
        }
        return mix;
    }
}