public class Number_of_digits {
    public static void main(String[] args) {
        int num=10;
        int base =2;//-->in which base you want to count the no.of digits for that num.
        //base10 means decimal
        //base2 means binary
        //base8 means octal
        //base16 means hexadecimal
        /*the number of digits that a number will have in base b
                 =integer value of logAbaseB +1


         */
        int ans =(int)(Math.log(num)/Math.log(base))+1;
        //here we are converting the x we got by log operations to int,
        //by explicitly doing narrowing conversion.
        System.out.println(ans);

    }
}
