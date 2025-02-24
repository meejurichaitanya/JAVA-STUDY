public class String_builder {
    public static void main(String[] args) {
        //String builder is a class in java , it is also like string but it is an
        //advanced and optimized version of string
        StringBuilder letters= new StringBuilder();
        for (int i = 0; i <26 ; i++) {
           // char ch=(char)('a'+i)+;
            letters.append((char)('a'+i)+" ");

        }
        System.out.println(letters);
    }
}
