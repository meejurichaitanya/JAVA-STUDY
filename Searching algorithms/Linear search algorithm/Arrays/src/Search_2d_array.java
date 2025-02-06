import java.util.Arrays;

public class Search_2d_array {
    public static void main(String[] args) {
        int[][] numbers={

                {1,22,332,33},
                {12,2323,45},
                {898,22},
                {21,44,32,555,32}
        };
        int[] ans=search(numbers,88);
        System.out.println(Arrays.toString(ans));

    }
    static int[] search(int[][] nums,int target){

        for (int i = 0; i < nums.length ; i++) {
            for (int j = 0; j <nums[i].length ; j++) {
                if (nums[i][j]==target){
                    return new int[]{i,j};
                }

            }

        }return null;
    }
}
