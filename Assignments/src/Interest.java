//java program for finding simple interest using P,T,R

import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.print("enter your principal:");
        int principal=in.nextInt();
        System.out.print("enter the time:");
        float time=in.nextFloat();

        System.out.print("enter your intrest rate:");
        float rate=in.nextFloat();
        double simpleinterest=(principal*time*rate/100);
        System.out.println("your simple interest will be:"+simpleinterest);


    }
}
