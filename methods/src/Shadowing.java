public class Shadowing {
    static int x = 21;
    public static void main(String[] args) {
        System.out.println(x);//21
        int x=100;
        add();/* 21-here it prints the class variable x=21 because
        the method add() is running outside of the present scope and
        inside of class scope so it take x from class variable. */

        System.out.println(x);/*100-local variable x is shadowing class
        variable x within this scope.lower scope variable shadowed the
        higher scope variable
             */

    }static void add(){
        System.out.println(x);

    }
}
