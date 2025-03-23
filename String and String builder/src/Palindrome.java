import java.util.Arrays;

public class Palindrome {
    public static void main(String[] args) {
       String name ="";
       System.out.println(check_palindrome1(name));
       System.out.println(check_palindrome2(name));
       System.out.println(check_palindrome3(name));

    }
    //1.this method also we can check that if a string is palindrome or not, by using String builder
    //to store the all characters from original string 1 by 1 and in the end we can check if the value
    //acquired by stringbuilder is equal to original string or not, if it is original then true
    //otherwise false..
    static boolean check_palindrome1(String str){

        StringBuilder check =new StringBuilder();
        for (int i = str.length()-1; i >=0 ; i--) {
            check.append(str.charAt(i));

        }

        return str.equals(check.toString());
    }
    static boolean check_palindrome2(String str){

       int start =0;
       int end =str.length()-1;
       while (start<end){
           if (str.charAt(start)!=str.charAt(end)){
               return false;
           }
           start++;
           end--;
       }
       return true;

    }
     /*
      for (int i = 0; i <=(str.length()-1)/2 ; i++) {
            int start=i;
            int end=str.length()-1-i;
            if (str.charAt(start)!=str.charAt(end)){
               return false;
            }
        }

         */
    static boolean check_palindrome3(String str){
        StringBuilder reversed =new StringBuilder(str).reverse();
        reversed.toString();
        return str.equals(reversed);

    }
}
