import java.util.Scanner;

public class Reversal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number:");
        long num = input.nextLong();
        long r_num =0;

        for (;num!=0;num /= 10){
            int rem = (int) (num)%10;

            r_num=r_num*10+rem;

        }System.out.println("reversal of the number is:"+r_num);
    }
}
