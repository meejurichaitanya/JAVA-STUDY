import java.util.Arrays;

public class ShuffleArray {
    public static void main(String[] args) {
        int[] nums={2,5,1,3,4,7};
        int n=3;
        System.out.println(Arrays.toString(shuffle(nums,n)));

    }
    static int[] shuffle(int[] nums, int n){
        int[] ans= new int[nums.length];
        int i =0;
        int x=0;
        int y=nums[n];

        while(i<nums.length){
            ans[i]=nums[i];
            ans[i+1]=y;
            x++;
            y=nums[n+1];
            i += 2;

        }
        return ans;


    }
}
