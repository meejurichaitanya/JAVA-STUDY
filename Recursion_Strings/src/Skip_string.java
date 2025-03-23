public class Skip_string {
    public static void main(String[] args) {
        String str="joy sadlife happy";
        System.out.println(skipSad(str));
        System.out.println(skip_onlySad(str));
    }
    static String skipSad(String upstring){
        if (upstring.isEmpty()){
            return"";
        }
        char ch=upstring.charAt(0);
        if (upstring.startsWith("sad life")){
            return skipSad(upstring.substring(8));
        }else return ch+skipSad(upstring.substring(1));

    }
    static String skip_onlySad(String up){
        if (up.isEmpty()){
            return"";
        }
        char ch=up.charAt(0);
        if (up.startsWith("sad") && !up.startsWith("sad life")){
            return skip_onlySad(up.substring(3));
        }else return ch+skip_onlySad(up.substring(1));
    }
}
