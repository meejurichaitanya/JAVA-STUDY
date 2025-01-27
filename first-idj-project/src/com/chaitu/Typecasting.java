package com.chaitu;

import java.util.Scanner;

public class Typecasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /* here if we input integer value to a float variable from keyboard,
        java will automatically convert the integer to float.because the integer value
         is smaller than the declared data type(float).This is called type conversion*/

        //example implicit(WIDENING TYPE CASTING):
       /* float num = input.nextInt();
        System.out.println(num);



        /* we can also convert the incompatible types as well by manually
        this is called type Narrowing type casting.*/

        //example explicit (NARROWING TYPE CASTING):
       /* int num2 = (int) (45.5f);
        System.out.println(num2);
        //output=45

        float num3 = (float)(89.989898989);
        System.out.println(num3);
        //output=89.989
        */

       /* int a = 300;
        byte b=(byte)(a);
        System.out.println(b);
        //output=44
        */


      /*Automatic type promotion in expressions
        byte a=40;
        byte b=50;
        byte c=100;
        int d =a*b/c;
        System.out.println(d);      /* The output will be 20 and it is correct
        the question is, in the expression a*b it means 40*50 which results as 2000
        byte*byte=byte.so,how is 2000 storing in byte variable when the maximum range
        of byte is 256?it exceeds the range of byte to handle this problem java
        automatically promotes byte/short(or)whatever you take as integer.when
         evaluating this type of expressions.That means a*b operation is indirectly
         performed using integers,even though they are in byte.*/

      /*  byte a=20;
        byte b= (a*2);
        System.out.println(b);   /*here it will give error because,we already discussed
        above it performs expressions as integers, and an integer cannot be declared
        as byte that is the reason it is giving error.we can instead write like this
        "byte b=(byte)(a*2);" */

        //SUMMARIZE
        byte b= 50;
        short s= 5423;
        char c='A';
        int i=765678;
        float f=67.87f;
        double d=0.83888993;
       double result= (f*b)+(i/c)-(d*s);
       //float+int-double=double
       System.out.println( (f*b) +" "+(i/c)+" "+(d*s) );
       System.out.println(result);





    }
}
