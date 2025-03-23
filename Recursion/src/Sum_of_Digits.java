public class Sum_of_Digits {
    public static void main(String[] args) {
        System.out.println(sum_of_digits(4774));
    }
    static int sum_of_digits(int n){
        if (n == 0) {
            return 0;
        }
        int rem =n%10;
        return rem+ sum_of_digits(n/10);
    }
}
