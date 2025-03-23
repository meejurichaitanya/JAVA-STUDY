public class Print_n_numbers {
    public static void main(String[] args) {
        // print(10);
        // rev_print(10);
        print_both(5);
    }
    static void print(int n){
        if (n == 0) {
            return;
        }
        System.out.println(n);
        print(n-1);
    }
    /*if we want to print in reverse order we can first call the function
    print(n-1) first then we can print the n, by doing this the n will be
    printed when print(n-1) executes.
    at the end when print(1) calls print(0), the base condition will be satisfied
    which is n==0, the function call print(0) is returned to where it was called
    which is print(1), then print(1) will print the 1, and it also returns to the fuction
    where it was called , the print(1) is called inside the print(2) function,
    now print(1) has been finished executing so print(2) will print 2...
    .....this process continues until the last call finishes executing.
     */
    static void rev_print(int n){
        if (n == 0) {
            return ;
        }
        rev_print(n-1);
        System.out.println(n);
    }
    static void print_both(int n){
        if (n == 0) {
            return ;
        }
        System.out.println(n);
        print_both(n-1);
        System.out.println(n);
    }

}
