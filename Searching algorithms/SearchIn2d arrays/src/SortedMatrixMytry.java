import java.util.Arrays;

public class SortedMatrixMytry {
    public static void main(String[] args) {
        int[][]nums ={
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };
        int[][] arr={
                {5}
        };
        int target=5;
        System.out.println(Arrays.toString(SortedSearch(arr,target)));
    }
    static int[] SortedSearch(int[][] nums, int target){
        int rows=nums.length;
        int cols=nums[0].length;
        if (nums.length==1){
            return binarysearch(nums,0,0,cols-1,target);
        }
        int start_row=0;
        int end_row= nums.length-1;
        int mid_col=cols/2;

        while(start_row<end_row-1){
            int mid_row=start_row+(end_row-start_row)/2;
            if (nums[mid_row][mid_col]==target){
                return new int[]{mid_row,mid_col};
            } else if (nums[mid_row][mid_col]>target) {
                end_row=mid_row;

            }else start_row=mid_row;
        }
        //we got two rows if you don't find the target yet. we have to search on those remaining rows.
        if (target>=nums[start_row][0]&&target<=nums[start_row][cols-1]){
            return binarysearch(nums,start_row,0,cols-1,target);
        }else {
          return  binarysearch(nums,end_row,0,cols-1,target);
        }
    }
    static int[] binarysearch(int[][]nums,int row,int start, int end, int target){
        while (start<=end){
            int mid=start+ (end-start)/2;
            if (nums[row][mid]==target){
                return new int[]{row,mid};
            } else if (nums[row][mid]>target) {
                end=mid-1;

            }else start=mid+1;
        }
        return new int[]{-1,-1};

    }

}
