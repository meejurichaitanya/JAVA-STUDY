import java.util.Scanner;

public class Fibonacciwhile {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter a number:");
        int n=input.nextInt();
        int first=0;
        int second=1;
        int count=2;
        int next =0;
        System.out.println(+first+"\n"+second);
        while (count<n){
             next=first+second;
            System.out.println(next);
            first=second;
            second=next;
            count++;
        }
    }
}
