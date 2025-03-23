import java.util.Arrays;

public class Seive_Eratosthenes {
    public static void main(String[] args) {
        int num=20;
        seive(num);
    }
    static void seive(int n){
        boolean[] primes=new boolean[n+1];
        /*here we take array length as n+1 because we want to check the numbers
        from 1 to n and if we gie size as n the array will be created with index from
        0 to n-1(19) so instead we create an array with length of n+1(21) which will
        create an array that has an index starting from 0 to 20.
         */
        Arrays.fill(primes,true);
        primes[0]=primes[1]=false;
        /*initially if we create an empty array, all the elements in the array are
        false in starting  so for our comfort I've changed all the elements to true.
        Step1: if the number i is prime , we make all the multiples of i in that range
        as false.
        */
        for (int i = 2; i*i <=n ; i++) {
            if (primes[i]){
                for (int j = i*i; j <=n; j+=i) {
                     primes[j]=false;
                }
            }

        }
        for (int i = 0; i <=n ; i++) {
            if (primes[i]){
                System.out.println(i);
            }

        }

    }
}
