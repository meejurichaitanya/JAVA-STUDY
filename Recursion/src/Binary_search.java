public class Binary_search {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,55,66,77,88};
        int target = 88;
        int ans =search(arr,target,0,arr.length-1);
        System.out.print(ans);
    }
    static int search(int[] arr, int target, int start, int end){
        if (start>end){
            return -1;
        }
        int mid=start+(end-start)/2;
        if (arr[mid]==target){
            return mid;
        }
        if (target<arr[mid]){
            end=mid-1;
        }else start =mid+1;

        return search(arr,target,start,end);
    }
}
