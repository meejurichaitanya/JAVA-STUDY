public class MinIndex_in_Bitonic {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 4, 3, 2, 1,};
        int target = 3;
        int peak = findpeak(arr);
        int first_try_asc=OrderAgnosticBS(arr,target,0,peak);

        if (first_try_asc != -1){
            System.out.println(first_try_asc);
        }else {
            int second_try = OrderAgnosticBS(arr, target, peak + 1, arr.length - 1);
            System.out.println(second_try);
        }


    }

    static int OrderAgnosticBS(int[] arr, int target, int start, int end) {
        int ans = -1;
        boolean isAsc = (start < end);
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                ans = mid;
                end = mid - 1;

            } else if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else start = mid + 1;

            } else
                if (target < arr[mid]) {
                    start = mid + 1;
                } else end = mid - 1;


        }
        return ans;
    }
    static int findpeak(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid =start+ (end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end = mid;
            }else start =mid+1;

        }
        return start;

    }
}

