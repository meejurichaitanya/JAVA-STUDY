import java.util.Scanner;

public class Re_occur {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter a number:");
        long num = input.nextLong();

        System.out.print("enter a number you want to find the re occurance:");
        int n = input.nextInt();
        long count =0;
        for(int i= 0;num>i;i++){
            int rem = (int)(num)%10;
            if(rem == n){
                count ++;
            }num = num /10;
        }System.out.println(count);

    }
}
