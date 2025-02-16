import java.util.Arrays;

public class SortedMatrix_practice {
    public static void main(String[] args) {
        int[][] nums={
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        int target=13;
        System.out.println(Arrays.toString(search(nums,target)));
    }
    static int[] search(int[][]arr,int target){
        int rows=arr.length;
        int cols=arr[0].length;
        //edge case:when our array have only length 1 ,which only have one row.
        if(arr.length==1){
            return binarysearch(arr,target,0,0,cols-1);
        }
        int start_row=0;
        int end_row= arr.length-1;
        int mid_col=cols/2;

        while (start_row<(end_row-1)){
            int mid_row=start_row+ (end_row-start_row)/2;
            if (arr[mid_row][mid_col]==target){
                return new int[]{mid_row,mid_col};
            } else if (target<arr[mid_row][mid_col]) {
                end_row=mid_row;
            }else start_row=mid_row;
        }
        //after this while we only have 2 rows remaining check in those rows.
        if (arr[start_row][mid_col]==target){
            return new int[]{start_row,mid_col};
        }
        if (arr[end_row][mid_col]==target){
            return new int[]{end_row,mid_col};
        }
        //even now our target not found we check in remaining four parts
        //first part
        if (target<arr[start_row][mid_col]){
            return binarysearch(arr,target,start_row,0,mid_col-1);
        }else if (target>arr[start_row][mid_col]&&target<arr[start_row][cols-1]){
            return binarysearch(arr,target,start_row,mid_col+1,cols-1);
        } else if (target<arr[end_row][mid_col]) {
            return binarysearch(arr,target,end_row,0,mid_col-1);

        }else {
            return binarysearch(arr,target,end_row,mid_col+1,cols-1);
        }


        //third part
        //fourth part
    }
    static int[] binarysearch(int[][]arr,int target, int row,int startC,int endC){
        while (startC<=endC){
            int mid=startC+(startC-endC)/2;
            if (arr[row][mid]==target){
                return new int[]{row,mid};
            } else if (arr[row][mid]>target) {
                endC=mid-1;
            }else startC=startC+1;
        }
        return new int[]{-1,-1};

    }
}
