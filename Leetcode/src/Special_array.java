public class Special_array {
    public static void main(String[] args){
//https://leetcode.com/problems/special-array-i/?envType=daily-question&envId=2025-02-01
      int[] nums={1,2,3,4,5,6,7,8,9};
      System.out.println(isArraySpecial(nums));

    }

    static boolean isArraySpecial(int[] nums) {

                for(int i=0;i<nums.length-1;i++ ){
                    int num1=nums[i];
                    int num2=nums[i+1];
                    if(num1%2==0 && num2%2==0){
                        return false;
                    }else if(num1%2!=0 && num2%2!=0){
                        return false;
                    }
                }return true;


    }
}



