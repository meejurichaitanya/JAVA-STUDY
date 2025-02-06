import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter a number:");
        int num = input.nextInt();
        factorial(num);
    }
    static void factorial(int n){
        int factorial =1;
        for (int i =2; i<=n;i++){
            factorial=factorial*i;


        }System.out.println(factorial);
    }
}
