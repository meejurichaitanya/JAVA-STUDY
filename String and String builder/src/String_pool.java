public class String_pool {
    public static void main(String[] args) {
     //string_pool in java is a separate memory structure in heap memory ony.
     //all the string objects that are created will be stored in the string_pool
     //if we try to create any string that has same value, to an existing object in string_pool
     //it will just point out the new reference to the existing object rather than creating
     //new object.
     //1.because of this string_pool is used to optimization of memory instead of creating multiple
     //objects of same name ,it will just point all the ref's to the same value.
     //2.If any one ref change the object ,it cannot change the object for all ref like in arrays
     //because string is immutable means it cannot be changed.
    // if we try to change any string object using a ref variable it will not change the value
    //in it, instead it creates new string object.
     //String is a collection of characters which internally is an Array of characters
     //String is a class and it is one of the most used classes in java libraries.
        String name ="chaitu";
        String name1=name;
        System.out.println(name1);
        //if we change name1 value.
        name1="chaitanya";
        System.out.println(name);//here name value is not changed.it prints chaitu only.


    }
}