import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
        //mergesort
        int[] nums={7,6,5,4,3,2,1};
        mergesort(nums,0,nums.length);
        System.out.println(Arrays.toString(nums));

    }
    static void mergesort(int[] arr, int start, int end){
        if(end-start==1){
            return;
        }
        int mid=start+(end-start)/2;
        mergesort(arr,start,mid);
        mergesort(arr,mid,end);
        //after this we will get two sorted parts, now we just have to merge them
        merge(arr,start,mid,end);
    }
    static void merge(int[] nums, int start, int mid , int end){
        int[] mixed=new int[end-start];
        //FIRST HALF:start to <mid.
        //SECOND HALF:mid to <end.
        int i=start;
        int j=mid;
        int index=0;
        while (i<mid&&j<end){
            if (nums[i]<nums[j]){
                mixed[index]=nums[i];
                //by doing i++ we place the pointer to the next index in first half
                i++;
            }else{
                mixed[index]=nums[j];
                j++;
            }
            //in the above conditions only one of the condition will execute if or else
            //even one condition is executed we have to increase the index value ++
            index++;
        }
        /*when after the while loop breaks there may be a still a chance where
        some of the elements from the first half or second half is remained so we
        will add the remaining elements to the mixed array.
         */
        while (i<mid){
            mixed[index]=nums[i];
            index++;
            i++;

        }
        while (j<end){
            mixed[index]=nums[j];
            index++;
            j++;
        }
        /*after creating a sorted temporary array(mixed) ,now we have to replace the
        original array elements with the temporary array elements at their relevant
        indices.
         */
        for (int k = 0; k <mixed.length ; k++) {
            nums[start+k]=mixed[k];

        }



    }
}
