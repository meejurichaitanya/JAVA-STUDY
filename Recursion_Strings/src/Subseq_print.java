public class Subseq_print {
    public static void main(String[] args) {
        String str="abc";
        sub_seqs("",str);
        /*
        SUBSEQUENCE:it is for strings ,the order matters in subsequence
                   if we have Sequence="abc"
                     -->subsequences="ab","ac","abc"...
                       "ba" and "ca","cba" or not valid subsequences, because the order
                        matters in subsequences.


        SUBSET:it is for arrays, the order doesn't matter, that means
               if we have a set ={1,2,3}
                 -->subsets={1,2},{2,3},{1,3}
                   in subsets both{1,2} and {2,1} are valid subsets and both are same
                   so both cannot be counted as 2 subsets they are same 1 subset.
         */

    }
    static void sub_seqs(String p,String up){
        if (up.isEmpty()){
            System.out.print(p+" ");
            return;
        }
        char ch=up.charAt(0);
        /*in the first recursion call we take the first element to processed string and removed
        it from the upstring.Ex:p= will be "a" and up =will be "bc"
         */
        sub_seqs(p+ch,up.substring(1));
        /*
        In the second recursion call we ignore first element and removed it from the upstring
        Ex:p= will be "" and up+ will be "bc".
         */
        sub_seqs(p,up.substring(1));
    }
}
