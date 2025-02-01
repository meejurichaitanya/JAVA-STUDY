import java.util.Arrays;
import java.util.Scanner;

public class Multi_Dimensional_arrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] arr = new int[3][3];
        for (int row=0;row< arr.length;row++){
            for (int col=0;col<arr[row].length;col++){
                 arr[row][col]=input.nextInt();
            }
        }

      /*1  for(int[] num:arr){
            System.out.println(Arrays.toString(num));
        } */

       /*2  for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));

        }*/
        for (int r = 0; r<arr.length ; r++) {
            for (int c=0;c<arr[r].length;c++){
                System.out.print(arr[r][c]+" ");
            }
           System.out.println();
        }
    }
}
