import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a'+'b');//here takes the Ascii values of a and b then adds them.
        //Ascii value of a=97 and b=98 and a+b=195
        System.out.println("chaitu"+1);//after calling value of method 1 is also converted to string
        //so we are just adding string to a string.
        System.out.println('A'+1);//A value is 65, so it converts 65+1=66-this is
        //implicit type casting(widening) we learned about it.AUTOMATIC TYPE PROMOTION.
        System.out.println((char)('A'+1));//A+1=66, so here we are explicitly converting
        //int to char type int is bigger type than so it does'nt convert automatically
        //if we want to convert we have to do it explicitly.
        System.out.println("a"+1);//here after some steps internally 1 is converted to string
        //"a"+"1"=a1 ,both are strings at the end
        ArrayList<Integer> nums= new ArrayList<>();
        nums.add(1);
        nums.add(2);nums.add(3);nums.add(4);
        System.out.println("chaitanya"+nums);//here we added a arraylist with the string.
        System.out.println(nums);
        System.out.println("chaitanya"+10);
        System.out.println(new ArrayList<>()+""+1);
    }
}
