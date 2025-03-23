public class PermuTations {
    public static void main(String[] args) {
       String str ="abcdefg";
       permutations("",str);
    }
    static void permutations(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        //first we have to take the current character.
        char ch =up.charAt(0);
        /*unlike in subsets here we have to make variable no of recursive call
        at each level. the no of calls we make at each level will be depend on
        the length of processed string(p), we have to make p.length+1 recursive calls
        because we have to insert the current letter at variable positions.
        like if p ="a" that mean length =1, with common sense we can insert the
        current char "b" at before a("ba") and after a("ab")...at two different positions b
        can be inserted no of positions also depended on length of processed.
        So we will take a for loop and iterate from to length of p.
         */
        for (int i = 0; i <=p.length() ; i++) {
            String first =p.substring(0,i);
            String second =p.substring(i,p.length());
           permutations(first+ch+second,up.substring(1));
        }

    }
}