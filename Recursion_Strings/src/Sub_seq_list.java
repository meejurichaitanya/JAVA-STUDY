import java.util.ArrayList;

public class Sub_seq_list {
    public static void main(String[] args) {
        String str="abc";
        ArrayList<String> list =new ArrayList<>();
       sub_seqs("",str,list);
       System.out.println(list);
    }
    static void sub_seqs(String p, String up,ArrayList<String> list){
        if (up.isEmpty()){
            list.add(p);
            return ;
        }
        char ch =up.charAt(0);
        sub_seqs(p+ch,up.substring(1),list);
        sub_seqs(p,up.substring(1),list);

    }
}
