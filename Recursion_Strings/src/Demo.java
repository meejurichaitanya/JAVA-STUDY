public class Demo {
    public static void main(String[] args) {
        int[] nums ={2,3,4,7,11};
        int k =5;
        System.out.println(findKthPositive(nums,k));

    }
    static int findKthPositive(int[] arr, int k) {
        int count =0;
        int end = arr.length-1;
        int num =0;
        for(int i =1;i<=arr[end];i++){
            int result = search(arr,i);
            if(result==-1){
                count++;
                num =i;
            }
            if(count ==k){
                break;
            }
        }
        return num;

    }
    static int search(int[] nums, int target ){
        int start =0;
        int end=nums.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]>target){
                end =mid-1;
            }else start=mid+1;
        }
        return -1;

    }
}
