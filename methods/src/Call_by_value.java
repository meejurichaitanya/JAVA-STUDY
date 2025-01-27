import java.util.Arrays;

public class Call_by_value {
    public static void main(String[] args) {
        int[] arr ={1,33,44,22};
        modify(arr);
        System.out.println(Arrays.toString(arr));
        /*Here after using the modify method can it modify our
        array?YES
        The array is modified the after calling the modify() method
        because ,here it copies the reference of the arr[] to the
        modify() method parameters nums[], (OR) the value of the
        reference variable arr[] is being copied to the parameter
        nums[] in the method.SO,THEREFORE BOTH THE REFERENCES
        WILL POINT TO THE SAME OBJECT,SO CHANGE FROM NUMS[0] WILL
        ALSO EFFECT ARR[0].IT IS ACTUALLY CALL BY VALUE */

    }
    static void modify(int[] arr){
        arr[0] = 12;
    }
}
