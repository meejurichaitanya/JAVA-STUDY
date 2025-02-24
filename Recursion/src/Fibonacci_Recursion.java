public class Fibonacci_Recursion {
    public static void main(String[] args) {
        /*print the nth fibonacci:
        we know that nth fibonacci(n)=fib(n-1)+fib(n-2)//this formula is known as recurrence relation
        fib(n-1)=fib(n-2)+fib(n-3); fib(n-2)=fib(n-3)+fib(n-4)....this continues till
        we reach the base condition.
        HOW TO IDENTIFY IF THE PROBLEM CAN BE SOLVED USING RECURSION OR NOT?
          find if the problem can be break down to smaller problems.if it is then
          we can use the recursion on it.
        HOW TO IDENTIFY THE BASE CONDITION?
         BASE CONDITION:it is the condition where our recursive function call will stop

         "To identify base condition, base condition can be represented by the answer
         we already have.
         int fibonacci we know that first =0;second=1, so this the base
         condition"
         "Here whenever n is less than 2 either it can be 1 or 0 it doesn't
          make any recursive call it just returns the n"
         if(n<2){
         return n;
         }


        */
        int ans=fibonacci(4);
        System.out.print(ans);
    }
    static int fibonacci(int n){
        if (n < 2) {
            return n;

        }
        return fibonacci(n-1)+fibonacci(n-2);
        /*
        Important point is that the fibonacci(n-2) will not execute until the
        function fibonacci(n-1) is not completed its execution.
         */
        /*This is a not a tail recursion because when the function call is
        returned ,it performs addition and returns the value ,this extra operation
        addition is performing here so it is nit a tail recursion.

         */
    }
}
