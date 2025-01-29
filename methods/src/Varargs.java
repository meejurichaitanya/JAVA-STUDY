import java.util.Arrays;

public class Varargs {
    public static void main(String[] args) {
        varargs(1,2,2,2,2,2,2);
        multiple(10,"chaitanya",65.4f,'c',"chaitu","seeba","tobi","thorfin");

    }
    static void varargs(int...nums){
        nums[3]=23;


        System.out.println(Arrays.toString(nums));
        /*in java if we do not use Arrays.toString(), while
        printing an array ,by default it will print the memory address
        of the array, not the actual content of the array.
         */
    }
    static void multiple(int a,String b,float c,char d,String...names){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(Arrays.toString(names));

    }
}
