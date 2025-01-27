import java.util.Scanner;
public class Multiplication_Table {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter table number:");
        int num = input.nextInt();
        System.out.println("multiplication table for"+num+":");
        for(int i=1;i<=10;i++){

            System.out.println(+num+"x" +i +"="+num*i);
        }
    }
}
