public class Right_most_set_bit {
    public static void main(String[] args) {
        int num = 2;
    /*if you want to find Right most set bit of a number ,the negative of that
    same number have every bit as opposite of its positive number except Right
    most set bit.
    1.so we can do +N&(-N), which will result the Right mist set bit, because
    it is the one bit that is same in both +N and -N.
     */
        int RSB = num & (-num);
        System.out.println(RSB);


    }

}
