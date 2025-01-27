import java.awt.desktop.SystemSleepEvent;
import java.util.Scanner;

public class Days_in_month {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter month number:");
        int month = input.nextInt();
        switch (month){
            case 1,3,5,7,9,11 ->System.out.println(31);
            case 4,6,8,10,12 ->System.out.println(30);
            case 2 ->System.out.println(28);
            default -> System.out.println("Invalid month");
            //if any of the above cases didn't work then default will execute
        }

    }
}
