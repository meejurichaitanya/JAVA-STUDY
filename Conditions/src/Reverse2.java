import java.util.Scanner;

public class Reverse2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number:");
        int num = input.nextInt();
        int ans = 0;
        while(num > 0){
            int rem = num%10;
            num = num/10;
            ans = ans*10+rem;
        }System.out.println("Reverse number:"+ans);
    }
}
