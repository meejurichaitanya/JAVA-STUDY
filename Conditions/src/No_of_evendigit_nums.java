public class No_of_evendigit_nums {
    public static void main(String[] args) {
        int[] nums={1,32,34,2,24,34,123};
        int count=0;
        for(int i=0;i<nums.length;i++){
          if(isevendigits(nums[i])){
              count++;
          }
        }
        System.out.println(count);
    }
    static boolean isevendigits(int num){
        int count=0;
        while (num!=0){
            num=num/10;
            count++;
        }
        return count%2==0;
    }
}
