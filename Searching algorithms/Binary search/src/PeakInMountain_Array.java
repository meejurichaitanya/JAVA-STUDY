public class PeakInMountain_Array {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,5,5,4,3,2,1};
        System.out.println(peak(arr));

    }
    static int peak(int[]arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=start+ (end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end =mid;
            }else start=mid+1;
        }
        return start; //you can return start/end both will point to the peak at last.
    }
}
