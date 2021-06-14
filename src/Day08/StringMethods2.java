package Day08;

public class StringMethods2 {


        public static void main(String[] args) {
            //equals()           Compares two strings. Returns true if the strings are equal,
            //                      and false if not                                                   boolean
            //equalsIgnoreCase()     Compares two strings, ignoring case considerations               boolean
            String str1="Hello";
            String str2="Hello"; // this comes from string pool
            String str3=new String("Hello"); //this comes from java heap
            String str4=new String("World");
            //eqquals method will only care exact match value
            //not the memory (object type)
            System.out.println(str1.equals(str2));  //true
            System.out.println(str2.equals(str3));   //true
            System.out.println(str1.equals(str3));  //true
            System.out.println(str2==str3); //false   different object
            System.out.println(str1==str2); //true
        }

}
