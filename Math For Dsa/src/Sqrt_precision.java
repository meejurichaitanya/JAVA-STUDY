public class Sqrt_precision {
    public static void main(String[] args) {
        int n=20;
        int p=3;//precision--> 3 it means you want the square root to be accurate up to 3 decimal places
         double ans =sqrt(n,p);
         System.out.printf("%.3f",ans);
    }
    /*
    This is nothing, first we just do the binary search and if we didn't find the sqrt that
    means the number do not have perfect square , so we take floor of that sqrt as root.
    we also take an increment value=0.1 starting.
    now we iterate a for loop for precision times (p times)
    -->we check while root*root <=n if yes, we do root=root+increment.
       while loop breaks when root*root >n this will cause due do the operation of increment+root
       so when loop breaks we do root=root-increment, this puts root*root==n
       Then we do increment=increment/10--> by doing this we get increment as 0.01.
       then again i++ where p=1-->same above process will continue...........increment=0.01/10=0.001
       then again i++ where p=2-->same above process will continue........................
       ...................this for loop breaks when i=p.
     */
    static double sqrt(int n, int p){
        int start=0;
        int end =n;
        while (start<=end){
            int mid = start+(end-start)/2;
            if (mid*mid==n){
                return mid;
            } else if (mid*mid>n) {
                end=mid-1;
            }else start=mid+1;
        }
        double root=end;
        double incr=0.1;
        for (int i = 0; i <p ; i++) {
            while (root*root<=n){
                root+=incr;
            }
            root=root-incr;
            incr=incr/10;

        }
        return root;
    }
}
