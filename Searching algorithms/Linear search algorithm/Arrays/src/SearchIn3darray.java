import java.util.Arrays;

public class SearchIn3darray {
    public static void main(String[] args) {
        int[][][] nums={
                {{1,2,3,4},{5,6,7,8},{9,10,11,12}},
                {{13,14,15,16},{17,18,19,20},{21,22,23,24}},
                {{25,26,27,28},{29,30,31,32},{33,34,35,36}}
        };
       int target=100;
       System.out.println(Arrays.toString(search(nums,target)));
    }
    static int[] search(int[][][] nums,int target){
        for (int i = 0; i < nums.length ; i++) {
            for (int j = 0; j <nums[i].length ; j++) {
                for (int k = 0; k <nums[i][j].length ; k++) {
                    if (nums[i][j][k]==target){
                        return new int[]{i,j,k};
                    }

                }

            }

        }
        return new int[]{-1,-1,-1};

    }

}
