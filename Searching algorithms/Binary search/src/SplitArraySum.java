public class SplitArraySum {
    public static void main(String[] args) {
        int[] nums={10,20,30,40,50};
        int split =3;
        System.out.println(splitArray(nums,split));

    }

    static int splitArray(int[] nums, int k) {
            int start=0;
            int end =0;
/*MINVALOFRANGE: the case is that no matter what the k value they give, the min value of the range where
our answer will lie is largest element in the array(because if k=nums.length,we have to
first take the largest sum in the individual sub-arrays then we find the min in those.in thi
case if k=nums.length ,it means each element in the array is a sub array itself,so we take
the largest one among them which is the largest element
   so the largest element in the array will be our MINRANGE. */
/*MAXVALOFRANGE: we can assume if the k=1 which means we can split the array into only one
 array which is the array itself ,so after that we know that we have to take largest sums
 of individual sub-arrays ,here we have only one sub array so ,the sum of the sub array is
 the sum of all elements in the array.
   so the sum of all elements in the array will be our MAXRANGE.  */
            for(int i=0;i<nums.length;i++){
                start=Math.max(start,nums[i]);
                end=end+nums[i];
            }
            //now after this for we got our start and end.
            //which are min and max range where our answer will lie
            //now we just have to do a simple binary search to find our answer.
            while(start<end){
                int mid= start+(end-start)/2;
                int sum =0;
                int pieces=1;
                for(int num:nums){
                    if(sum+num>mid){
                        sum=num;
                        pieces++;
                    }else sum =sum+num;
                }
                if(pieces<=k){
                    end =mid;
                }else start=mid+1;
            }
            return start;
        }
    }

