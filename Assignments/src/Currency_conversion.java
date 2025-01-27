import java.util.Scanner;

public class Currency_conversion {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("enter your currency in rupees:");
        int rs=input.nextInt();
        //as of now 1 dollar=86.54rs and 1rs=0.012
        float dollars= (float) (rs/86.54);
        System.out.println("in dollars:"+dollars);

    }
}
