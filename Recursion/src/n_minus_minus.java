public class n_minus_minus {
    public static void main(String[] args) {
      print(5);
    }
    static void print(int n){
        if (n == 0) {
            return;
        }
        System.out.println(n);
        print(n--);
        /*here it will print 5 infinite times until the call stack overflow
        is occurred, because of n--.
        n--: it first pass n as the argument then it will do the n-1 operation
            that mean for every sub recursive call in the recursion we are just
            passing the 5 only, so the base condition will never met hence the stack
            overflow will occur.
         we can solve this by using --n.
        --n: it first do n-1 operation then it will pass it as argument
         */
    }
}
