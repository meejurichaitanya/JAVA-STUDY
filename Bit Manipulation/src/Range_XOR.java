public class Range_XOR {
    public static void main(String[] args) {
        /*to find the XOR between range a to b, we can do XOR(b)^XOR(a-1)
        -->We are just removing the extra bits we XORed by again doing
        XORing them.

         */
        int a =3;
        int b=9;
        int ans = XOR(b)^XOR(a-1);
        System.out.println(ans);
        System.out.println(XOR(b));

    }
    static int XOR(int n){
        if (n%4==0){
            return n;
        } else if (n%4==1) {
            return 1;
        } else if (n%4==2) {
            return n+1;
        }else return 0;
    }
}
