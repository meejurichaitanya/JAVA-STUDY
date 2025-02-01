import java.util.Arrays;

public class Max_2d_array {
    public static void main(String[] args) {
        int[][] numbers={

                {1,22,332,33},
                {12,2323,45},
                {898,22},
                {21,44,32,555,32}
        };

        System.out.println(max(numbers));

    }
    static int max(int[][] nums){
        int max =Integer.MIN_VALUE;
        for (int i = 0; i < nums.length ; i++) {
            for (int j = 0; j <nums[i].length ; j++) {
                if (nums[i][j]>max){
                    max=nums[i][j];
                }

            }

        }return max;
    }

}
