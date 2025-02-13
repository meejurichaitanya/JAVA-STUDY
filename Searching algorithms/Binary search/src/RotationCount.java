public class RotationCount {
    public static void main(String[] args) {
         int[] nums={4,5,6,6,7,0,1,2,4,4};
         System.out.println(countRotation(nums));
    }
    static int countRotation(int[] nums){
        int pivot =findpivotduplicates(nums);
        return pivot+1;

    }


    //use this for duplicate values
    static int findpivotduplicates(int[] arr){
        int start=0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+ (end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }else if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[start]==arr[mid]&&arr[mid]==arr[end]){
                //in this case we have to ignore duplicate values
                //but before ignoring we have to check the start
                //and end because they might be also pivots.
                if(start<end&&arr[start]>arr[start+1]){
                    return start;
                }
                start++;
                //now check if end is pivot
                if(end>start&&arr[end]<arr[end-1]){
                    return end-1;
                }
                end--;
            }else if(arr[start]<arr[mid]||arr[start]==arr[mid]&&arr[mid]>arr[end]){
                start=mid+1;
            }else end =mid-1;
        }
        return -1;
    }
    //use this for distinct values
    static int findpivot(int[] arr){
        int start=0;
        int end =arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if((mid<end) && (arr[mid]>arr[mid+1])){
                return mid;
            }else if((mid>start)&&(arr[mid]<arr[mid-1])){
                return mid-1;
            }else if(arr[mid]<=arr[start]){
                end =mid-1;
            }else start=mid+1;
        }
        return -1;
    }
}
