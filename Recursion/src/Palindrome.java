import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("enter your number:");
        int num = input.nextInt();
        System.out.println("entered number is palindrome:"+" "+is_palindrome(num));

    }
    static boolean is_palindrome(int num ){
        return num==revers_num(num);
    }
    static int revers_num(int num){
        if (num%10==num) {
            return num;
        }
        int digits=(int)(Math.log10(num)+1);
        int rem = num%10;
        return rem*(int)Math.pow(10,digits-1)+revers_num(num/10);
    }
}
