import java.util.Arrays;

public class FirstAndLast_position {
   // https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,5,5,6,7,8};
        int target=4;


        int first=find_first(nums,target);
        int last=find_last(nums,target);
        int[] ans={first,last};
        //ans[0]=first;
        //ans[1]=last;
        System.out.println(Arrays.toString(ans));
    }
    static int find_first(int[]arr,int target){
        int first =-1;
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid =start + (end-start)/2;
            if(target<=arr[mid]){
                end =mid-1;
            }else start=mid+1;

            if(arr[mid]==target){
                first=mid;
            }
        }
        return first;
    }
    static int find_last(int[]arr,int target){
        int last = -1;
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid=start + (end-start)/2;
            if(target>=arr[mid]){
                start=mid+1;
            }else end = mid-1;

            if(arr[mid]==target){
                last = mid;
            }
        }
        return last;
    }
}
