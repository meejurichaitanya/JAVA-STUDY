import java.util.Arrays;

public class SortedMatrix {
    public static void main(String[] args) {
        int[][] arr= {
                {1,2,3},
                {4,5,6},
                {7,8,9}

        };
        int target=10;
        System.out.println(Arrays.toString(search(arr,target)));
    }
    static int[] search(int[][] arr, int target){
        int rows=arr.length;//in our case:4
        int cols=arr[0].length;//in our case:4
        //edgecase where matrix length will be 1 row.
        if(arr.length==1){
          return binarysearch(arr,target,0,0,cols-1);
        }

        int start_row=0;
        int end_row=arr.length-1;
        int mid_col=cols/2;
        
        //running a loop until we got rows last for check.
        //the logic for this will be ,when will we consider if there are only
        //two rows are remaining.when (start=end-1)example:after looping sometimes
        //if startrow=2 and endrow=3 ,the above condition passes.the loop has to break when it passes
        
        while(start_row<(end_row-1)){
            int mid_row=start_row+(end_row-start_row)/2;

            if(arr[mid_row][mid_col]==target){
                return new int[]{mid_row,mid_col};
            }
            if (arr[mid_row][mid_col]>target){
                end_row=mid_row;
            } else {
                start_row=mid_row;
            }

        }
        //check in mid col of remaining two rows we got ,may be we can find ans.
        if (arr[start_row][mid_col]==target){
            return new int[]{start_row,mid_col};
        }
        if (arr[end_row][mid_col]==target){
            return new int[]{end_row,mid_col};
        }
        //otherwise
        //check in first half
        if (target<arr[start_row][mid_col]){
            return binarysearch(arr,target,start_row,0,mid_col-1);
        }
        //check in second half
        if (target>arr[start_row][mid_col]&& target<arr[start_row][cols-1]){
           return binarysearch(arr,target,start_row,mid_col+1,cols-1);
        }
        //check in third half
        if (target<arr[end_row][mid_col]){
            return binarysearch(arr,target,end_row,0,mid_col-1);
        }
        //check in fourth half
       // if (target>arr[end_row][mid_col]&& target<arr[end_row][cols-1]){
        else {
            return binarysearch(arr,target,end_row,mid_col+1,cols-1);
            }
        
    }
    static int[] binarysearch(int[][] arr,int target,int row,int startC,int endC){

        while (startC<=endC) {
            int mid = startC + (endC - startC) / 2;
            if (arr[row][mid] == target) {
                return new int[]{row, mid};
            } else if (target < arr[row][mid]) {
                endC = mid - 1;
            } else startC = mid+1;
        }
        return new int[]{-1,-1};
    }
}
