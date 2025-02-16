import java.util.Arrays;

public class Search_string {
    public static void main(String[] args) {
      String name = "chaitanya";
      char target = 't';
      System.out.println(name);
      //System.out.println(Arrays.toString(name.toCharArray()));
      System.out.println(search_string(name,target));



    }
    static boolean search_string(String str,char a){

        for (char c : str.toCharArray()) {
            if (c == a) {
                return true;
            }
        }
        return false;
    }
}
