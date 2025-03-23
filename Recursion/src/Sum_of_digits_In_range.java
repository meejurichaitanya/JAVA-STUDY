import java.util.Arrays;

public class Sum_of_digits_In_range {
    public static void main(String[] args){
        int m=0;
        int n=10;
        System.out.println(sum_in_range(m,n));
        /*Basically you are given with a range m and n, you to add all the
        digits starting from m to n.
        Ex:m=0
           n=3
           Output:0+1+2+3=6;
         */
        //Bruteforce
      /*  int ans =0;
        for (int i = m; i <=n ; i++) {
            ans =ans+i;

        }
        System.out.println(ans);  */
    }
    static int sum_in_range(int a , int b){
        if(a==b){
            return b;
        }
        return a+sum_in_range(a+1,b);
    }

}
