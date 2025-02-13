public class Search_In_Rotated_array {
    public static void main(String[] args) {
        //https://leetcode.com/problems/search-in-rotated-sorted-array/
        int[] nums ={4,5,6,7,0,1,2,3};
        int target = 0;
        System.out.println(search(nums,target));


    }
    /*In rotated sorted array we have to find and element(target).
    steps: 1.first we have to find the pivot of the array.
             pivot:it means it is the element from where the rotation is started.
           2.after finding pivot now we can have to apply simple binary search for
           both sides of pivot.So we do two binary searches.
             i. start=0; and end=pivot.
            ii. start=pivot+1; and end=array.length-1.
            That's it in the end we get answer.
    How to find the pivot?
          Take start =0; and end =arr.length-1 and calculate mid in while start<=end.
          case1:if(mid<end && arr[mid]>arr[mid+1])= mid=PIVOT.
          case2:if else(mid>start && arr[mid]<arr[mid-1])=mid-1=PIVOT
          case3:if else (start>arr[mid])=end =mid-1;
          case4:else if(start<arr[mid])=start=mid+1;-->we are using mid+1 because if mid=pivot
                it could've been caught by the above 1 and 2 cases.

     */
    static int search(int[] nums, int target) {
        int pivot=findpivot(nums);
        int firstsearch=search(nums,target,0,pivot);
        if(firstsearch != -1){
            return firstsearch;
        }else {
            int secondsearch=search(nums,target,pivot+1,nums.length-1);
            return secondsearch;
        }

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
    static int search(int[] arr,int target,int start,int end ){
        while(start<=end){
            int mid = start+ (end-start)/2;
            if(arr[mid]==target){
                return mid;
            }else if(target<arr[mid]){
                end = mid-1;
            }else start=mid+1;
        }
        return -1;
    }
}
