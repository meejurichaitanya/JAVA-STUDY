import java.util.Scanner;

public class Prime_method {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter a number:");
        int  num = input.nextInt();
        prime(num);
    }
    static void prime(int n){
        if(n<=1){
            System.out.println("neither prime nor composite");
            return;
        }
        int c = 2;
        while(c*c <= n){
            if(n%c == 0){
                System.out.println(+n +" "+"is not a prime number");
                return;
            }
            c++;
        }System.out.println(n +" "+"is a prime number");
    }
}
