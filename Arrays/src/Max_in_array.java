public class Max_in_array {
    public static void main(String[] args) {
        int[] nums={1,2,3,45,5,6,50,};
        System.out.println(max(nums));
        System.out.println(maxInRange(nums,1,5));

    }
    static int max(int[] arr){
        if (arr==null){
            return -1;
        }

        int max=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]>max){
                max =arr[i];
            }

        }return max;
    }
    static int maxInRange(int[] arr,int start,int end){
        if (start>end){
            return -1;
        }
        if (arr==null){
            return -1;
        }

        int max=arr[start];
        for (int i=start;i<=end;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }return max;
    }
}
