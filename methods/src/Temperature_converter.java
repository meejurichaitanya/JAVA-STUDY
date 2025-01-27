import java.util.Scanner;

public class Temperature_converter {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("enter the temperature you want to convert:");
        String Temperature =input.next();
        switch (Temperature) {
            case "celsius" -> {
                System.out.print("enter temperature in celsius:");
                float temp = input.nextFloat();
                fahrenheit(temp);
            }
            case "fahrenheit" -> {
                System.out.print("enter your temperature in fahrenheit:");
                float temp = input.nextFloat();
                celsius(temp);
            }
            default -> System.out.println("invalid temperature parameter");
        }

    }
    static void celsius(float f){
        float celsius =(5/9)*(f-32);
        System.out.println("temperature in celsius:"+celsius);
    }
    static void fahrenheit(float c){
        float fahrenheit =(c* 9/5)+32;
        System.out.println("temperature in fahrenheit:"+fahrenheit);
    }
}
