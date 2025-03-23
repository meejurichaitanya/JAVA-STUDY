public class Rotated_Binary_Search {
    public static void main(String[] args) {
        int[] arr ={6,7,8,9,1,2,3};
        int target =9;
        System.out.println(search(arr,target,0, arr.length-1));

    }
    static int search(int[] nums, int target,int start, int end){
        if (start>end){
            return -1;
        }
        int mid =start+(end-start)/2;
        if (nums[mid]==target){
            return mid;
        }
        //First we are checking whether left half is sorted or not
        if (nums[start]<nums[mid]){
            if (target>=nums[start]&&target<nums[mid]){
                return search(nums, target, start, mid-1);
            //the else condition is used to check in the right half
            //when the answer is not in the left half
            }else return search(nums, target, mid+1, end);
        }
        //if left half is not sorted then only this condition works, checks in right half
        if (target>nums[mid]&&target<nums[end]){
            return search(nums, target, mid+1, end);
         //this else condition is used to search back in left half if the target
         //is not available in right half
        }else return search(nums, target, start, mid-1);
    }
}
