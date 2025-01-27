import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {

       int ans = sum1(32,87);
       System.out.println(ans);


    }
    //we can pass values through the main method using parameters.
    static int sum1(int a , int b){
        int sum = a+b;
        return sum;

    }


    static int sum2() {
        Scanner input = new Scanner(System.in);
        System.out.print("enter first num:");
        int num1 = input.nextInt();
        System.out.print("enter second num:");
        int num2 = input.nextInt();
        int sum = num1+num2;
        return sum;

    }

     static void sum() {
        Scanner input = new Scanner(System.in);
        System.out.print("enter first num:");
        int num1 = input.nextInt();
        System.out.print("enter second num:");
        int num2 = input.nextInt();
        int sum = num1+num2;
        System.out.println(sum);
    }




}