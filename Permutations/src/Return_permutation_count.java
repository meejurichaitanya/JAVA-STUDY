public class Return_permutation_count {
    public static void main(String[] args) {
        String str ="abc";
        System.out.println(permutationcount("",str));
    }
    static int permutationcount(String p, String up){
        if (up.isEmpty()){
            //int count =1;
            return 1;
        }
        int count =0;
        char ch =up.charAt(0);
        for (int i = 0; i <=p.length() ; i++) {
            String first =p.substring(0,i);
            String second=p.substring(i,p.length());
          count=  count+permutationcount(first+ch+second,up.substring(1));
        }
        return count;
    }
}
