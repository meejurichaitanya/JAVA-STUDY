import java.util.Scanner;

public class  Temperature{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter temperature:");
        float temp=in.nextFloat();
        float fheit=(temp*9/5)+32;
        System.out.println("temperature in fahreinheit:"+fheit +"F" );

    }
}