public class Infinite_Array {
    public static void main(String[] args) {
        //assume this as a infinite array hence you dont know the size of the array.
        //so our first task is to find the start and where our target will lie between.
        //to find that we are using an additional function to find the range.
        int[] nums = {1, 3, 5, 7, 9, 12, 34, 56, 67, 78, 89, 90, 96, 97, 99};
        int target = 34;
        int ans = range(nums, target);
        System.out.println(ans);
    }

    static int range(int[] arr, int target) {
        /*first we are taking start =0 and end =1(the size of the chunk will be
        2 at first because there are only 2 elements.We gradually keep doubling the
        size until we found where our target will lie between.
        to double the size:(end-start+1)
         */
        int start = 0;
        int end = 1;
        while (target > arr[end]) {
            int newstart = end + 1;/*we are taking new start here because we dont want to
             modify start before we find  next end ,because to find next end we need
             to have previous start value.*/
            end = end + (end - start + 1) * 2;//doubling the chunk size for next chunk. chunk size=end-start+1;
            start = newstart;
        }
        return binary_search(arr, target, start, end);
    }

    static int binary_search(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else start = mid + 1;

        }
        return -1;
    }
}