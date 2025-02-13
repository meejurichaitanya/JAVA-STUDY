public class FindInMountainarr {
    //https://leetcode.com/problems/find-in-mountain-array/description/
    public static void main(String[] args) {
        int[] arr ={0,5,3,1};
        int target=1;
        //Here we have to the minimum index that the target element is occurred at
        //if the target element is not present in array return -1;
       System.out.println( search(arr,target));
    }
    static int search(int[] arr,int target){
            int peak=peak(arr);
            int ans =-1;
            int start = 0;
            int end = peak;
            boolean found =false;
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if(arr[mid]==target){
                    ans=mid;
                    found =true;
                    end =mid-1;

                } else if (target<arr[mid]) {
                    end =mid-1;
                }else start=mid+1;
            }
            //this if block will only work if we do not found any solution,
           //in the ascending part of the array.
            if(!found){
                start=peak;
                end =arr.length-1;
                while(start<=end){
                    int mid = start + (end-start)/2;
                    if (arr[mid]==target){
                        ans=mid;
                        end=mid-1;
                    } else if (target < arr[mid]) {
                        start=mid+1;
                    }else end =mid-1;
                }

            }
            return ans;

    }

    static int peak(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid = start+ (end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end=mid;
            }else start=mid+1;
        }
        return start;//we can start or end in the end both will point to one.
    }
}
