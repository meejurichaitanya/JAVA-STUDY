import java.util.Arrays;

public class Simplelinearsearch2d {
    public static void main(String[] args) {
        int[][] nums={
                {1,2,23,3},
                {12,31,4,325,5},
                {11,231,112,}
        };
        int target= 100;
        //if we want to search in the array we can just use our regular
        //bruteforce linear search which will check the elements in the array
        //one by one until it finds the target.if there is no target it will
        //return -1.
       /* Best case: When target found at the first check= O(1),that means
                 irrelevant to the size of the array in best case it checks
                 only one time So time complexity =O(1).

          Worst case:when the target is at the last row and last column,then
          it checks from starting row, starting column to ending row ending column
          So, in the worst case it perform checks=no of elements in the array.
          therefore worst case time complexity =O(n*m)
          n-->no of rows or row size
          m-->no of columns in row 0r column size
        */

        System.out.println(Arrays.toString(search(nums,target)));


    }
    static int[] search(int[][] nums, int target){
        for(int i=0;i<nums.length;i++){
            for(int j=0; j<nums[i].length;j++){
                if(nums[i][j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}