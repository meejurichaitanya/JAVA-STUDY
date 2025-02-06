import java.util.Scanner;

public class Largest_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number:");
        int num1 = input.nextInt();
        System.out.println("enter second number:");
        int num2 = input.nextInt();
        System.out.println("enter third number:");
        int num3 = input.nextInt();
       System.out.println( largest_number(num1,num2,num3));

    }
    static int largest_number(int num1,int num2, int num3){
        if(num1>num2&&num1>num3){
           return num1;
        } else if (num2>num1&&num2>num3) {
            return num2;
        }
        return num3;
    }
}
