public class Pivot {
    public static void main(String[] args) {
        int[] nums={0,1,2,3,4,5,6,7};
        System.out.println(findpivot(nums));

    }
    static int findpivot(int[] arr){
        int start=0;
        int end =arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if((mid<end) && (arr[mid]>arr[mid+1])){
                return mid;
            }else if((mid>start)&&(arr[mid]<arr[mid-1])){
                return mid-1;
            }else if(arr[mid]<=arr[start]){
                end =mid-1;
            }else start=mid+1;
        }
        return -1;
    }
}
