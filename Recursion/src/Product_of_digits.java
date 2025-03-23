public class Product_of_digits {
    public static void main(String[] args) {
        System.out.println(product_of_digits(1204));
    }
    static int product_of_digits(int n){
        if (n == 0) {
            return 1;
        }
        //by doing this we can get the last digit
        int rem =n%10;
        return rem*product_of_digits(n/10);
    }
}
