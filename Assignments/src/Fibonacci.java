import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        /*what is a fibonacci series?
        a fibonacci series is a sequence of numbers where each number is
        the sum of two preceding numbers.Starts from 0 and 1--> 0+1=1,1+1=2,
        1+2=3,2+3=5,3+5=8........upto the number you entered.
         */
        Scanner input = new Scanner(System.in);
        System.out.print("enter number of terms:");
        int n=input.nextInt();
        int first=0;
        int second=1;
        System.out.println("fibonacci series:");
        for(int i=0;i<n;i++){
            int next=first+second;

            System.out.println(next);
            first=second;
            second=next;

        }
    }
}
