public class Rotated_BS_InDuplicates {
    //https://leetcode.com/problems/search-in-rotated-sorted-array-ii/description/
    public static void main(String[] args) {
        //Given the array nums after the rotation and an integer target,
        // return true if target is in nums, or false if it is not in nums.
        int[] nums={1,1,2,2,0,0};
        int target =0;
        System.out.println(searchTarget(nums,target));
    }
    static boolean searchTarget(int[] nums, int target) {
        int pivot=findpivot(nums);
        if(pivot == -1){
            return search(nums,target,0,nums.length-1);
        }else if(target>=nums[0]){
            return search(nums,target,0,pivot);
        }else{
            return search(nums,target,pivot+1,nums.length-1);
        }

    }
    //finding pivot in the rotated array with duplicate values
    static int findpivot(int[] arr){
        int start=0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+ (end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }else if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[start]==arr[mid]&&arr[mid]==arr[end]){
                //in this case we have to ignore duplicate values
                //but before ignoring we have to check the start
                //and end because they might be also pivots.
                if(start<end&&arr[start]>arr[start+1]){
                    return start;
                }
                start++;
                //now check if end is pivot
                if(end>start&&arr[end]<arr[end-1]){
                    return end-1;
                }
                end--;
            }else if(arr[start]<arr[mid]||arr[start]==arr[mid]&&arr[mid]>arr[end]){
                //this condition makes sure that left half sorted
                /*
                arr = [6, 7, 8, 1, 2, 3, 4, 5]
                mid = (0 + 7) / 2 = 3 → arr[mid] = 1
              Checking the condition:

               arr[start] < arr[mid] → 6 < 1 ❌ (False)
               (arr[start] == arr[mid] && arr[mid] > arr[end]) → 6 == 1 && 1 > 5 ❌ (False)
                   The condition fails, meaning the left half is NOT sorted.
                   So, the right half (1, 2, 3, 4, 5) must be sorted.

                   Same here also if arr[mid]<arr[end] it conforms that left half is not sorted
                   and moves search space to end=mid-1;
                   -->rarely occur in duplicates

                 */
                start=mid+1;
            }else end =mid-1;
        }
        return -1;
    }

    //basic binary search
    static boolean search(int[] arr,int target,int start, int end){
        while(start<=end){
            int mid= start+(end-start)/2;
            if(arr[mid]==target){
                return true;
            }else if(target<=arr[mid]){
                end=mid-1;
            }else start=mid+1;
        }
        return false;
    }
}
