import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("enter a your rollno:");
        String rollno=input.next();
        System.out.println("your rollno:"+rollno);
        System.out.println(".................................");

        System.out.print("enter your name:");
        String name=input.next();
        System.out.println("your name :"+name);
        System.out.println(".................................");

        System.out.print("enter your marks:");
        float marks=input.nextFloat();
        System.out.println("your marks:"+marks);
        System.out.println("................................");
        input.nextLine();
        System.out.print("introduce yourself:");
        String introduce=input.nextLine();
        System.out.print("introduction"+introduce);






    }
}
