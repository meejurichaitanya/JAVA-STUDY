import java.util.Scanner;

public class Counting_occurence {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter a number:");
        int num = input.nextInt();
        System.out.println("enter the re-occur number:");
        int re_occur = input.nextInt();
        int count = 0;
        while(num >0){
            int rem=num % 10;
            if (rem == re_occur){
                count++;

            }num=num/10;



        }System.out.println(count);
    }
}
