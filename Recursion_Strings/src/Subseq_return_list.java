import java.util.ArrayList;

public class Subseq_return_list {
    public static void main(String[] args) {
        String str="abc";
        System.out.println(subseq("",str));

    }
    static ArrayList<String> subseq(String p, String up){

        if (up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch =up.charAt(0);

        ArrayList<String> left=subseq(p+ch,up.substring(1));
        ArrayList<String> right=subseq(p,up.substring(1));
        left.addAll(right);
        return left;
        /*
        you are adding all the right elements to left so we are returning left , if we
        do right.addAll(left), then we can return right as well, because there we add
        all the elements from the left to right.
         */
    }

}
