public class Skip_letter_Kunal {
    public static void main(String[] args) {
        String name ="r o r o n a o azoro";
        skipletter("", name);
        //processed string is empty at starting-->"";
        //UpString is our main string
        System.out.println(skipletter2(name));

    }
    static void skipletter(String p, String upString){
        if (upString.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch= upString.charAt(0);
        if (ch==' '){
            //here is the char is whitespace we ignore i mean we did'nt add
            //it to our processed string.
            //upstring will be passed from index 1.
            skipletter(p, upString.substring(1));

           //else if the char anything rather than whitespace we will add it
           //to the processed string.
        }else skipletter(p+ch, upString.substring(1));
    }
    //if you want to return the string
    static String skipletter2(String upString){
        if (upString.isEmpty()){
            return upString;
        }
        char ch=upString.charAt(0);
        if (ch==' '){
            //when ch is whitespace we dont add it
            return skipletter2(upString.substring(1));

            //when ch is any other character we will add it and call
            //next recursion which takes substring of upstring starting from 1.
        }else return ch +skipletter2(upString.substring(1));
    }
}
