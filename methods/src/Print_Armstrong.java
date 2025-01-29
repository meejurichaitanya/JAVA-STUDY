import java.util.Scanner;

public class Print_Armstrong {
    public static void main(String[] args) {
        //let us print all three digit armstrong numbers. min three digit =100, max=999.

        for(int i =100;i<1000;i++){

            if (is_Armstrong(i)){
                System.out.print(i+" ");
            }
        }




    }




    static boolean is_Armstrong(int num ){
        int input = num;
        int ans = 0;
        while (num>0){
            int rem =num%10;
            num = num/10;
            ans = ans + (rem*rem*rem);
        }return ans==input;
    }
}
