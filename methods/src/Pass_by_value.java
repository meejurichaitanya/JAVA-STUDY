public class Pass_by_value {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        swap(a,b);
        System.out.println(a +" "+b);

    }  /*Here also after using the swap method the values of a and b in
    main method have not changed because of PASS BY VALUE ,in java when
    you pass arguments to a method("in our program we are passing a and b
    to the arguments num1 and num2 in the method")a copy of variable
    values is sent to the parameters num1 and num2.Therefore any changes
    we made to the copied values ,does not effect the values of the
    main method.THIS IS THE REASON FOR A AND B NOT SWAPPED EVEN AFTER
    USING THE METHOD. */



    static void swap(int num1,int num2){
        int temp = num1;
        num1 = num2;
        num2 = num1;


    }
}
