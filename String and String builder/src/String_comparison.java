public class String_comparison {
    public static void main(String[] args) {


    /*1."==" using this we can compare the both refs are pointing to the same object or not
    we know that we create new string with value ,which is already existed in string_pool
    it will just point the new ref variable to the existing object .
    hence both are pointing to the same object ,in this case it will give true.*/
        String name = "chaitu";
        String name2 = "chaitu";
        System.out.println(name==name2);//it has to print true because both are pointing
        //towards the same object in the string pool.
        String a="Spider";
        String b= "venom";
        System.out.println(a==b);//false both are different objects so both ref variables
        //point towards the different objects.
        //the question is how to check actual value in it?
        //2. We can use .equals() method to check if both variables have same value or not.
        //we can create same value of string objects as different objects ,without caring about
        //string_pool and optimization we can explicitly say java to create a new object
        String x=new String("chaitu");
        String y=new String("chaitu");
        //here both x and y has same values but instead of string_pool we explicitly declared
        //both the objects as different objects in the heap
        System.out.println(x==y);//false because both are not pointing to the same ref both are
        //pointing to different objects
        System.out.println(x.equals(y));//it will give true because it will actually check the
        //values that the ref's are pointing here both x and y has same value .so true.

    }
}
