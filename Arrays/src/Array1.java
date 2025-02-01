import java.util.Arrays;

public class Array1 {
    public static void main(String[] args) {
        int[][] nums={
                {1,2,2},
                {2,2,2},
                {1,2,2}
        };
        for(int i=0;i< nums.length;i++){
            System.out.println(Arrays.toString(nums[i]));
        }
        String[][] names ={
                {"chaitanya","eren","thorfin"},
                {"ramu","allah","jeasus"},
                {"kai","tyson","dragoon"}


        };
        for(String[] nam:names){
            System.out.println(Arrays.toString(nam));
        }
    }
}
