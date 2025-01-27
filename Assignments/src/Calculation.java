import java.util.Scanner;

public class Calculation {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("enter first number:");
        double num1=input.nextDouble();
        System.out.print("enter second number:");
        double num2=input.nextDouble();


        System.out.print("enter your operation:");
        String operation=input.next();

        if (operation.equals("+")){
            System.out.println("result:"+(num1+num2));
        } else if (operation.equals("-")) {
            System.out.println("result:"+(num1-num2));
        } else if (operation.equals("*")) {
            System.out.println("result:"+(num1*num2));
        } else if (operation.equals("/")) {
            if (num2!=0) {
                System.out.println("result:" + (num1 / num2));
            }else {
                System.out.println("Error:division by zero is not possible");
            }
        } else {
            System.out.println("invalid operation");
        }



    }
}
