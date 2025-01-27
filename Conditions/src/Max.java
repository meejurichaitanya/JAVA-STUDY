import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        int b=input.nextInt();
        int c=input.nextInt();
        int max=Math.max (c, Math.max (a ,b));
        System.out.println(max);

    }
}
