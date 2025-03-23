public class Newton_Sqrt {
    public static void main(String[] args) {
        int n= 35;
        System.out.printf("%.3f",Nsqrt(n));
    }
    /*
      formula for newton_square_root--> root= (x+n/x)2 (x+n/x whole divided by 2)
        *where x is our assumed square_root.
        *n is the number given.
       If we assume x, the error/difference between actual root and x =root-x.
        example: if root of 36 is 6, but we assumed  x as 5. what is the error between
         our assumption and actual root--> root-x.here, 6-5=1
        How we are going to solve this?
         -->first we assume given number n as x.
            Then do root=(x+n/x)/2;
          then we check error, if root-x is <1, then we break the loop.
          if error is greater than 1 , we update our x as root.
          this process will continue until error is <1
     */
    static double Nsqrt(int n){
        double root;
        double x=n;
        while (true){
            root=(x+(n/x))/2;
            if (Math.abs(root-x)<0.1){
                break;
            }else x=root;
        }
      return root;
    }
}
