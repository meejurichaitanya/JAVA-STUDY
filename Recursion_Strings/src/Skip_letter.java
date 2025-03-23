public class Skip_letter {
    public static void main(String[] args) {
        /*
        let us say you are given with a number you have to remove all the
        'particular letters' from it
         */
        String name ="zozorikoko";
        /*bruteforce
        StringBuilder ans =new StringBuilder();
        for (int i = 0; i <name.length() ; i++) {
            if (name.charAt(i)!='o'){
                ans.append(name.charAt(i));
            }
        }
        System.out.println(ans); */
        //using recursion
        StringBuilder ans= new StringBuilder();
        removeletter1(name,0, ans);
        System.out.println(ans);
        System.out.println(removeletter2(name,0));
    }
    //now lets try to do it using recursion
    /*
    In recursion also we can do it in two ways ,
    1.passing the Ans(stringBuilder) in arguments.
    2.creating a new String in every call and adding them .
     */
    static void removeletter1(String str,int index, StringBuilder ans){
        if(index==str.length()){
            return;
        }
        if (str.charAt(index)!='o'){
            ans.append(str.charAt(index));
        }
        removeletter1(str, index+1, ans);


    }
    static String removeletter2(String str, int index){
        if (index==str.length()){
            return "";
        }
      char ch= str.charAt(index);
        if (ch=='o'){
            return removeletter2(str,index+1);
        }else return ch+removeletter2(str, index+1);

    }

}