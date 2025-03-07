public class Find_unique {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,1,2,3,};
        /*Using X-OR(^) for every number gives you the unique one because if
        you X-OR a number with same number it will give you 0.
        like in addition and subtraction here also order doesn't matters
        example if you do like (1+2+3+4+(-1)+(-2)+(-3)), here also all the positive
        and negative numbers will be cancelled and only the unique element remains
        It will be applied to same for X-OR also .
        here all the 1,2,3 and 1,2,3 will be cancelled because we know that if we
        X-OR a number with same number you will get 0.
        (1^1)^(2^2)^(3^3)^4=0^0^0^4=4
        */
        //Finding the unique element
        int unique=0;
        for (int i = 0; i <nums.length ; i++) {
           unique=unique^nums[i];

        }
        System.out.print(unique);

    }
}
