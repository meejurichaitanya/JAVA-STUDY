import java.util.Scanner;

public class Sum_loop {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("enter a number:");
        int num = input.nextInt();

        sum_number(num);
    }
    static void sum_number(int n){

        int sum =0;
        while(n>0){
            int rem =n%10;
            n = n/10;
            sum= sum +rem;

        }System.out.println("sum of the number:"+" "+sum);
    }
}
