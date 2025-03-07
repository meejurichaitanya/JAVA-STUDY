public class Sum_prime_numbers {
    public static void main(String[] args) {
        //we have to find the sum of prime numbers from m to n.
        //lets take the range
        int m= 2;
        int n= 100;
        int prime_sum=0;
        for (int i =m ; i <=n ; i++) {
            if (isprime(i)){
                prime_sum=prime_sum+i;
            }

        }
        System.out.print(prime_sum);
    }
    static boolean isprime(int n){
        if (n==1){
            return false;
        }
        int c=2;
        while (c*c<=n){
            if (n%c==0){
                return false;
            }else c++;

        }
        return true;
    }
}
