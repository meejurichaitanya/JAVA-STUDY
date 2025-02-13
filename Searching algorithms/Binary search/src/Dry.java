import java.util.Arrays;

public class Dry {
        public static void main(String[] args) {
            int[] nums = {1, 2, 3, 4, 4, 4, 4, 5, 6, 7};
            int target = 4;
            System.out.println(Arrays.toString(occurrence(nums, target)));

        }

        static int[] occurrence(int[] nums, int target) {
            int first = search(nums, target, true);
            int last = search(nums, target, false);
            return new int[]{first, last};
        }

    static int search(int[] arr,int target,boolean isfirst){
            int ans =-1;
            int start=0;
            int end =arr.length-1;
            while(start<=end){
                int mid = start + (end-start)/2;
                if (arr[mid]==target){//(target==arr[mid])
                    ans = mid;
                    if (isfirst) {
                        end = mid - 1;
                    } else start = mid + 1;

                }else if(target<arr[mid]){
                    end = mid-1;
                }else // (target>arr[mid]){
                    start=mid+1;
                }
             return ans;
            }

    }


