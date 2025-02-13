public class Floor_number {
    public static void main(String[] args) {
      /*Floor of a number:you are given with a target number and you
        have to find the largest number  that is smaller than equal to the given
        target number.

        step1:identify the target.
        step2:Identify all the numbers in the array that are smaller than or equal
         to the target number.
        step3:pick the largest one among those numbers.//answer */
        int[] arr = {3,5,7,23,34,40};
        System.out.println(floor(arr, 34));
    }

   //return largest number <=Target
    static int floor(int[]array, int target) {
        if (target > array[array.length-1]) {
            return -1;
        }
        int start = 0;
        int end = array.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if ( target ==array[mid]) {
                return array[mid];
            } else if (target < array[mid]) {
                end = mid - 1;
            } else start = mid + 1;
        }
        return array[end];
    }
}
