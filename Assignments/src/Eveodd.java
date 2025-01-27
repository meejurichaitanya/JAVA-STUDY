/* Write a java program to print weather a number is even or odd
input from user*/

import java.util.Scanner;

public class Eveodd {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter a number:");
        int num =in.nextInt();

        if (num%2==0){
            System.out.println(num +" "+"is an even number");
        }
        else{
            System.out.println(num+" " +"is an odd number");
        }

    }
}
