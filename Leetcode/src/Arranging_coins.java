public class Arranging_coins {
    public static void main(String[] args) {
        //https://leetcode.com/problems/arranging-coins/description/
        /*
        You have n coins and you want to build a staircase with these coins. The staircase consists of
         k rows where the ith row has exactly i coins. The last row of the staircase may be incomplete.
         Given the integer n, return the number of complete rows of the staircase you will build.
         */
        /*
        My bruteforce approach:
            int coins=n;
        int rows=0;
        for(int row=1;row<=n;row++){
            if(coins>=row){
                rows=rows+1;
                coins=coins-row;
            }else break;
        }
        return rows;
         */
        int coins=5;
        System.out.println(arrangeCoins(coins));

    }
    static int arrangeCoins(int n) {
        long start=1;
        long end =n;
        long rows=0;
        /*we know that the sum of n natural numbers :1+2+3+4+5...n
           is (n*(n+1))/2. there we can try a binary search to find the sum of n natural numbers equal to n (or) less than n.*/
        while(start<=end){
            long mid=start+(end-start)/2;
            long sum=(mid*(mid+1))/2;
            if(sum==n){
                return (int)(mid);
            }else if(sum<n){
                rows=mid;
                start=mid+1;
            }else end =mid-1;


        }
        return (int)(rows);
    }
}
