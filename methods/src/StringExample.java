public class StringExample {
    public static void main(String[] args) {
        /*method Structure:
        return_type method_name(parameters){
             //body
             return statement
             }
         */
    String mygreet = greetings("chaitanya");
    System.out.println(mygreet);

        //System.out.println(greetings("chaitanya"));


    }

    static String greetings(String name){
        String greetings ="hello"+" "+name;
        return greetings;

    }

    //
    static String greet(){
        String greeting = "how are you?";
        return greeting;

    }
}
