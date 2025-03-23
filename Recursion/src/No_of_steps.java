public class No_of_steps {
    public static void main(String[] args) {
        System.out.println(numberOfSteps(14));

    }
    /*
    Given an integer num, return the number of steps to reduce it to zero.

     In one step, if the current number is even, you have to divide it by 2, otherwise,
      you have to subtract 1 from it.
     */
    //https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
    static int numberOfSteps(int num) {
        return helper(num,0);

    }
    static int helper(int n,int steps){
        if(n==0){
            return steps;
        }
        steps++;
        if(n%2==0){
            n=n/2;
        }else n=n-1;
        return helper(n,steps);
    }
}
