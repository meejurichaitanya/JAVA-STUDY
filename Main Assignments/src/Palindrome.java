import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
       /* Scanner input = new Scanner(System.in);
        System.out.println("enter a number:");
        int num = input.nextInt();
        if (is_palindrome(num)){
            System.out.println(num+" "+"is a palindrome");
        }else{
            System.out.println(num+" "+"is not a palindrome");
        } */
        for (int i = 100; i < 100000; i++) {
            if (is_palindrome(i)){
                System.out.println(i);
            }
        }

    }

        static boolean is_palindrome(int n){

            int ans =0;
            int num = n;
            while (n > 0) {
                ans = ans * 10 + (n % 10);
                n = n / 10;

            }
            return ans==num;

        }


}
