public class Sum_fibonacci {
    public static void main(String[] args) {
        int num =3;
        System.out.println(findfibonaccisum(num));
    }
    static int findfibonaccisum(int n){
        int first =0;
        int second =1;
        int sum =1;
        if(n==0) return 0;
        if(n==1) return 1;
        int count =2;
        int next =0;
        while(count<=n){
            next=first+second;
            first=second;
            second=next;
            sum=sum+next;
            count++;
        }
        return sum;
    }
}
