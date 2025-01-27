import java.util.Scanner;

public class Reversal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number:");
        int num = input.nextInt();
        while (num > 0){
            int reversedNumber = num%10;
            System.out.print(reversedNumber);
            num = (num/10);

        }
    }
}
