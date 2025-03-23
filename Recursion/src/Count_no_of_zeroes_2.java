public class Count_no_of_zeroes_2 {
    public static void main(String[] args) {
        int num=840030;
        System.out.println(count_zeroes(num,0));

    }
    static int count_zeroes(int n, int count){
        //when you are writing a recursive function always start with base condition
        if (n == 0) {
            return count;
        }
        int rem =n%10;
        if (rem==0){
            count++;
        }
        return count_zeroes(n/10,count);
    }
}
