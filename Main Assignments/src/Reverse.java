import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter a number:");
        long num = input.nextInt();
        long rnum = 0;
        while(num>0){
            int rem= (int)(num)%10;
            rnum=rnum*10+rem;
            num = num/10;
        }System.out.println("reversed number:"+rnum);
    }
}
