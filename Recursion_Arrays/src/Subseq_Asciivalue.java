import java.util.ArrayList;

public class Subseq_Asciivalue {
    public static void main(String[] args) {
       //let's say if you want to add ascii valued subsets too
        String str ="abc";
       // ascii_Subseq("",str);
        System.out.println(asciiSubseq_return("",str));
    }
    static void ascii_Subseq(String p, String up){
        if(up.isEmpty()){
            System.out.print(p+" ");
            return ;
        }
        char ch =up.charAt(0);
        ascii_Subseq(p+ch,up.substring(1));
        ascii_Subseq(p, up.substring(1));
        ascii_Subseq(p+(ch+0),up.substring(1));

    }
    static ArrayList<String> asciiSubseq_return(String p, String up){
       if (up.isEmpty()){
           ArrayList<String> list =new ArrayList<>();
           list.add(p);
           return list;
       }
       char ch =up.charAt(0);
       ArrayList<String> first =asciiSubseq_return(p+ch,up.substring(1));
       ArrayList<String> second=asciiSubseq_return(p,up.substring(1));
       ArrayList<String> third =asciiSubseq_return(p+(ch+0),up.substring(1));
       first.addAll(second);
       first.addAll(third);
       return first;
    }
}
