import java.util.Scanner;

public class Primenumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter a number:");
        int num = input.nextInt();
        if(num<=1){
            System.out.println("Neither prime nor composite");

        }
        int count =2;
        while(count <= num){
            if (num%count == 0){
                System.out.println(+num+":not a prime number");
                return;
            }
            count++;

        }System.out.println(+num+":prime number");
    }
}
