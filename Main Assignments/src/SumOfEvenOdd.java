public class SumOfEvenOdd {
    public static void main(String[] args) {
        //we  have to find the sum of even and odd digits separately till n number.
        int n=100;
        int even_sum=0;
        int odd_sum=0;
        for (int i = 1; i <=n ; i++) {
            if(i%2==0){
                even_sum=even_sum+i;
            }else odd_sum=odd_sum+i;

        }
        System.out.printf("even numbers sum:%d%nodd numbers sum:%d",even_sum,odd_sum);
    }
}
