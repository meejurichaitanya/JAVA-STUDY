import java.util.Arrays;
import java.util.Scanner;

public class Input{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr1={1,2,3,3,3};
        System.out.println(arr1[1]);

        int[] arr = new int[5];
        arr = new int[8];//changing reference to a new array with having more size
        for (int i=0;i<arr.length;i++){
            arr[i]=input.nextInt();
        }

       /* for (int i =0;i< arr.length;i++) {
            System.out.print(arr[i] + " ");
        } */
       /* for(int nums:arr) {
            System.out.print(nums + " ");
        } */

        /*advanced for-loop for arrays and collection in java ,it
        simplifies looping by eliminating explicit indexing and incrementing.
         */
        System.out.println(Arrays.toString(arr));


    }

}