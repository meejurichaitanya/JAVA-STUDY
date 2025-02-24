public class Simple_number_recursion {
    public static void main(String[] args) {
        //here we just try to print number from 1 to 5 using recursion
        print(1);
    }
    static void print(int n){
        System.out.println(n);
        if (n == 5) {
           return;
        }
        //otherwise just call the function again for next number(n+1)
        print(n+1);
        //this recursion is known as tail recursion because the recursive call
        //is the last step before returning the result.
        //means there are no pending operations after the return of function call
        //that means if there is nothing to do after the recursive call, its tail recursion
    }
}