public class Check_sorted {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        System.out.println(isSorted(arr));

    }
    static boolean isSorted(int[] nums){
        return helper(nums,0);
    }
    static boolean helper(int[] nums,int check){
        if (check==nums.length-1){
            return true;
        }
        if (nums[check]<nums[check+1]){
            return helper(nums,check+1);
        }else return false;
    }
    //kunals approach
    static boolean helper2(int[] nums,int check){
        if (check==nums.length){
            return true;
        }
        return nums[check]<nums[check+1]&&helper2(nums,check+1);
    }
}