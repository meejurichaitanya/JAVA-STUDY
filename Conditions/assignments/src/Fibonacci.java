import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("enter a number:");
        int num = input.nextInt();
        int first = 0;
        int second = 1;
        int count =0;
        while(count < num){
            if (count == 0){
                System.out.println(first);
            } else if (count == 1) {
                System.out.println(second);
            }else {
                int next = first + second;
                System.out.println(next);
                first = second;
                second = next;
            }
            count++;

        }
    }
}