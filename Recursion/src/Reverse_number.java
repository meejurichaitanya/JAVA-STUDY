public class Reverse_number {
    public static void main(String[] args) {
        int num =7612;
        reverse_num1(num);
        System.out.println(ans);



    }
    static int ans =0;
    static void reverse_num1(int n){
        if (n == 0) {
            return;
        }
        int rem =n%10;
        ans=ans*10+rem;
        reverse_num1(n/10);
    }

}
