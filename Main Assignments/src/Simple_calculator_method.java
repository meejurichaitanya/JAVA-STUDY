import java.util.Scanner;

public class Simple_calculator_method {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter first number:");
        int num1 = input.nextInt();
        System.out.print("enter second number:");
        int num2 = input.nextInt();
        System.out.print("enter operation:");
        char operation = input.next().trim().charAt(0);
        calculator(num1,num2,operation);
    }
    static void calculator(double a, double b,char c){
        switch (c){
            case '+':
               double ans = a+b ;
               System.out.println("ans:"+ans);
               break;
            case '-':
                ans = a-b;
                System.out.println("ans:"+ans);
                break;
            case '*':
                ans = a*b;
                System.out.println("ans:"+ans);
                break;
            case '/':
                ans = a/b;
                System.out.println("ans:"+ans);
                break;
            case '%':
                ans = a%b;
                System.out.println("ans:"+ans);
                break;
            default:System.out.println("Invalid operator");
        }
    }
}
