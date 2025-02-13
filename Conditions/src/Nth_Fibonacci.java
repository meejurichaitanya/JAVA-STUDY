public class Nth_Fibonacci {
    public static void main(String[] args) {
        int num=10;
       System.out.println( find_fibonacci(num));
    }
    static int find_fibonacci(int num){
        int first=0;
        int second=1;
        if (num==0) return 0;
        if(num==1) return 1;
        int next =0;

          //  System.out.print(first+" "+second+" ");

       for (int count=2;count<=num;count++){
            next = first+second;
           first=second;
           second=next;
           //System.out.print(next+" ");
       }
       return next;
    }
}
