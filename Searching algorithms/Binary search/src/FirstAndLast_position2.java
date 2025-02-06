import java.util.Arrays;

public class FirstAndLast_position2 {
    //https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
    public static void main(String[] args) {
        int[] nums={1,2,3,4,4,4,4,5,6,7};
        int target=4;
        System.out.println(Arrays.toString(occurrence(nums,target)));

    }
    static int[] occurrence(int[]nums,int target){
        int first=search(nums,target,true);
        int last=search(nums,target,false);
        return new int[]{first,last};
    }

    static int search(int[] arr, int target,boolean first_occurrence){
        int ans=-1;
        int start =0;
        int end =arr.length-1;
        while(start<=end){
            int mid=start + (end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }else if(target>arr[mid]){
                start= mid+1;
            }else if(target==arr[mid]) { //we acn directly use else but i personally used else-if for my undestanding purpose
                ans=mid;//we have find the potential answer
                if (first_occurrence){
                end = mid-1;
                }else {
                    start = mid + 1;
                }
            }
        }
        return ans ;
    }
}
