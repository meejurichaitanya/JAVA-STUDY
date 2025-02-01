import java.util.Arrays;
//creating swapping method for arrays
public class Swap_array_elements {
    public static void main(String[] args) {
        int[] nums ={1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(nums));
        swap(nums,0,1);
        System.out.println(Arrays.toString(nums));

    }
    static void swap(int[] arr,int index1, int index2){
        int temp = arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;

    }
}
