public class Prime {
    public static void main(String[] args) {
        System.out.println(isprime(2));
        for (int i = 1; i <=20 ; i++) {
            System.out.println(i+" "+isprime(i));


        }


    }
    static boolean isprime(int n){
        if(n==1){
            return false;
        }
        int ans;
        for (int i = 2; i*i <=n ; i++) {
            if (n%i==0){
                return false;
            }


        }
        return true;
    }
}