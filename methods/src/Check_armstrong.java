import java.util.Scanner;

public class Check_armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter a number:");
        long num = input.nextInt();
        //is_armstrong(num);
        System.out.println(is_armstrong(num));

    }
    static boolean is_armstrong(long num){
        long input = num;
        long ans = 0;
        while(num>0){
            int rem = (int)(num) % 10;
            num = num/10;
            ans = ans+(rem*rem*rem);

        }
        return ans==input;
    }
}
