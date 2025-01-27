public class Comparisions {
    public static void main(String[] args) {
        /*for primitive datatypes(like int,float,char,double),== it checks
        if the values are same.like the below example
         */
        int a1=10;
        int b1=10;
        System.out.println(a1==b1);//output=true, values are same(10).

        /* but for objects (like String ,ArrayList etc.)it == checks if
        the two references of the object points to the same location or not.
        It doesn't compare the actual value of the objects(like it does in the
        primitive types).like in the below example.
         */
        String str1=new String("hello");
        String str2=new String("hello");
        System.out.println(str1==str2);/*output:false ,here it(==) checks the memory locations
        that the references (str1,str2) are pointing ,so they both point to different
        memory locations thats why it is giving false)*/

        System.out.println(str1.equals(str2));/* output:true ,here(.equals) checks
        weather the values in the objects are same or not, and the values are same
        so it is giving me true) */

        //Another important point is if if we create a string like this:
        String a="hello";
        String b="hello";
        System.out.println(a==b);/* output:true. But why output will be true
        it has to false ,like we discussed above. == checks weather both reference
        variables(a and b) are pointing towards same object(or)same memory location.
        so if we create a string like this(String a=hello),the object(hello) will be
        stored in the STRING POOL instead of in HEAP.In STRING POOL what happens is
        if we create String(hello) in the new reference variable(b),the new reference
        variable(b) will point to the existing String(hello),instead of creating
        a new duplicate object(hello).so,that is the reason it is giving true
        because both references are pointing towards the same object/memory
        location(hello). */

        //instead we can create explicitly like
        String a2=new String("hello");
        String b2=new String("hello");
        System.out.println(a2==b2); /*output:false, because reference variables
        are pointing to different hello's as it creates duplicates in heap memory.
         */



    }
}
