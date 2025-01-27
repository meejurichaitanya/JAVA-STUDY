import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("enter first number:");
        int num1=input.nextInt();
        System.out.print("enter second number:");
        int num2=input.nextInt();
        if (num1>num2){
            System.out.println(num1+" "+"is largest");
        } else if (num2>num1){
            System.out.println(num2+" "+"is largest");
        }else{
            System.out.println("both numbers are equal");
        }

    }
}
