import java.util.Arrays;

public class SortedRwiseCwise {
    public static void main(String[] args) {
        int[][] nums ={
            {1,3,5},
            {2,6,9},
            {4,8,12}
        };
        int target=12;
        System.out.println(Arrays.toString(search(nums,target)));
        /*Here we can do normal linear search to find the answer but
        in this case every row and every column is sorted(like the
        array is in increasing order),in this case we can reduce the
        time complexity and improve the efficiency using staircase
        method.
        Tip:whenever in a interview, if you are asked to find an element or
        data or whatever ,try to analyze how we can reduce the search space.

        Staircase: this method only works if the array is sorted in both row-wise
        and column-wise. Even if any one row has extra column size this will not work
        1. Take row=0; and start from the right corner of the matrix take
         it as column col=array[row].length-1.
         case1= if(arr[row][col]==target)->ans found
         case2: if(arr[row][col]>target)->col--;(moving left- eliminate col)
         case3: if(arr[row][col]<target)->row++(moving down- eliminate row)

         Worst case: when the target is not found or the target is at bottom left
                     corner of the matrix.
         the worst case time complexity in staircase=O(n+m)
         n->no of rows
         m-> no of columns


         */

    }
    static int[] search(int[][] nums, int target){
        int row=0;
        int col=nums[row].length-1;
        while(row<nums.length&&col>=0){
            if (nums[row][col]==target){
                return new int[]{row,col};
            }else if (nums[row][col]>target){
                col--;
            }else row++;
        }
        return new int[]{-1,-1};
    }
}
