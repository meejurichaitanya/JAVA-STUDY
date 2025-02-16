import java.util.Arrays;

public class BubblesortDesc {
    public static void main(String[] args) {
        int[] nums={7,6,5,4,3,2};
        bubblesortdesc(nums);
        System.out.println(Arrays.toString(nums));

    }
    static void bubblesortdesc(int[] nums){
        boolean swapped;

        for(int i=0;i<nums.length-1 ;i++){
            swapped=false;
            for(int j=1;j<nums.length-i;j++) {
                if (nums[j] > nums[j - 1]) {
                    swap(nums,j, j - 1);
                    swapped=true;
                }
            }
            if (!swapped){
                break;
            }
        }
    }
    static void swap(int[] nums,int index1,int index2){
        int temp=nums[index1];
        nums[index1]=nums[index2];
        nums[index2]=temp;

    }
}
