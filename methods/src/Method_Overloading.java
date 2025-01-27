public class Method_Overloading {
    public static void main(String[] args) {
        same(10);
        same(10,20);
        same('c',10);
        same(10,'c');

    }

    static void same(int a){
      System.out.println(a);
    }
    static void same (int a, int b ){
        System.out.println(a+" "+b);

    }
    static void same(char a, int b){
        System.out.println(a+" "+b);
    }
    static void same(int a, char b){
        System.out.println(a+" "+b);
    }

    /*METHOD OVERLOADING - It is a feature in java that allows a class to have
     multiple methods with the same name ,but with the different parameter lists.
     RULES:
     1.Different number of parameters
     2.Different types of parameters
     3.Different sequence of parameters

     */
}
