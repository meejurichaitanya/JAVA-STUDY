import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name ="       chaitanya how are you    ";
        System.out.println(name);
        System.out.println(name.length());
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.strip());//This Strip function is used to remove white spaces.
        System.out.println(name.strip().charAt(3));
        System.out.println(name.strip().concat(String.valueOf(1)));
        System.out.println(Arrays.toString(name.split(" ")));
        int ans =27811;
        String ans1 =(""+ans);
        System.out.println(Arrays.toString(ans1.toCharArray()));

    }
}
