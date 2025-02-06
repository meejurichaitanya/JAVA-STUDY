import java.util.Scanner;

public class Ceiling_number {
    public static void main(String[] args) {
        /*ceiling of a number:you are given with a target number and you
        have to find the smallest number that is greater than equal to the given
        target number.
        step1:identify the target.
        step2:Identify all the numbers in the array that are greater than or equal
         to the target number.
        step3:pick the smallest one among those numbers.//answer
         */
        int[] arr = {3,5,7,23,34,40};
        System.out.println(ceiling(arr, 10));
    }

     //return smallest number >= Target
        static int ceiling(int[]array, int target) {
            if (target > array[array.length-1]) {
                return -1;
            }
            int start = 0;
            int end = array.length - 1;

            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (array[mid] == target) {
                    return array[mid];
                } else if (target < array[mid]) {
                    end = mid - 1;
                } else start = mid + 1;
            }
            return array[start];
        }

}
