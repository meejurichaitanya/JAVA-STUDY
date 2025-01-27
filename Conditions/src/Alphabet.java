import java.util.Scanner;

public class Alphabet {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        char ch=input.next().trim().charAt(0);
        if(ch>='a' && ch<='z'){
            System.out.println("lower case");
        }else {
            System.out.println("upper case");
        }




    }
}