public class Poor_performance {
    public static void main(String[] args) {
        String letters="";
        for (int i = 0; i <26 ; i++) {
            letters=letters+((char)('a'+i))+" ";

        }
        System.out.println(letters);
    }
    /*POOR_PERFORMANCE:Because in each iteration it is copying previous String object
    and adding a new character to it(which will be a string after we add String+char=String)
    and creating a new string object each time.
    It means it is creating a new object which is waste of memory ,this happens because
    String is immutable therefore it is creating new object each time.This results in
    SPACE COMPLEXITY:O(n^2)
              Because at each iteration it is creating a string size of increasing
   (1+2+3+4.................n) the total no of space is = sum of n natural numbers
   =n*(n+1)/2=(n^2)-->O(n^2).

    TIME COMPLEXITY:O(n^2)
              Because at each iteration it is copying the previous String and adding the
              new character to it, and in each iteration the size of the copying string is
              increasing so obviously time also keep increasing in each iteration like
              (1+2+3+4...........n) the total no of taken is = sum of n natural numbers
              =n*(n+1)/2=(n^2)--->O(n^2).

      To OPTIMIZE this we have string_builder, which takes the character and it just
      adds it to the previous string instead of creating new one.

     */
}
