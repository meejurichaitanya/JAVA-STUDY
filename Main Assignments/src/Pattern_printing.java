import java.util.Scanner;

public class Pattern_printing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number:");
        int num =input.nextInt();
        for(int i =1;i<=num;i++){
            for (int j =1;j<=i;j++){
                System.out.print("*");
            }System.out.println();

        }

    }
}
