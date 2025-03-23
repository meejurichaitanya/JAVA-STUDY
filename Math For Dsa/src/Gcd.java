public class Gcd {
    public static void main(String[] args) {
        int a=7;
        int b= 3;
       // int ans=gcd(a,b);
        int ans=lcm(a,b);
        System.out.println(ans);
    }
    /*
    we know that by euclidean algorithm gcd(a,b)=gcd(b%a,a).
    if we keep dividing b with a it will be 0 at some point, at that point
    0 will be passed as 'a' in the recursive call argument.
    That is where we have to break the recursion gcd(0,x)=x, so we return x
    in that point.
     */
    static int gcd(int a, int b){
        if (a==0){
            return b;
        }

        return gcd(b%a,a);
    }
    static int lcm(int a, int b){
        return a*b/gcd(a, b);
    }
}
