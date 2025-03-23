public class Sum_of_n_numbers {
    public static void main(String[] args) {
       System.out.println(sum(5));
    }
    static int sum(int n){
        if (n == 1) {
            return 1;

        }
        return n+sum(n-1);
        /*
        we are writing this because sum of all digits till 5= 5+sum of all digits till 4
        Similarly sum(4)=4+=sum(3)......sum(2)=2+sum(1).
        sum(1)=1--> base condition
         */
    }
}
