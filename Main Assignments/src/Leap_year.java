import java.util.Scanner;

public class Leap_year {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a year:");
        int year = input.nextInt();
        System.out.println(isleapyear(year));

    }
    static boolean isleapyear(int year){
       if((year%4==0 && year%100!=0)||(year%400==0)){
           return true;
       }
       return false;
    }
}
