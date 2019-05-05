package com.phani.concepts;

public class learningStrings {
    public static void main(String[] args) {

        String string = new String("Phani Teja Kesha");
        String string1 = new String("Phani Teja Kesha");
        String string2 = "Phani Teja Kesha";
        String string3 = "Phani Teja Kesha";

        System.out.println(string.equals(string1));
        System.out.println(string==string1);
        System.out.println(string.equals(string2));
        System.out.println(string==string2);
        System.out.println(string2.equals(string3));
        System.out.println(string2==string3);

        StringBuffer  stringBuffer  = new StringBuffer("Phani Teja Kesha");
        StringBuilder stringBuilder = new StringBuilder("Phani Teja Kesha");


        System.out.println(stringBuffer);
        System.out.println(stringBuilder);
        System.out.println(stringBuffer.capacity());
        stringBuffer.append(" UMBC");
        System.out.println(stringBuffer.capacity());
        System.out.println(stringBuffer.substring(3,5));
        System.out.println(stringBuffer.subSequence(3,5));
        System.out.println(stringBuffer.lastIndexOf("l"));
        System.out.println(stringBuffer);
        System.out.println(stringBuffer.reverse());

        stringBuilder.append(" UMBC");
        System.out.println(stringBuilder);
        System.out.println(stringBuilder.reverse());


    }
}


/*
Notes:
1) Equals implementation in string has both checking the string values are same of reference is same where as
== only checks if the reference is equal
2) String is immutable in Java, so it’s easy to share it across different threads or functions.
3) When we create a String using double quotes, it first looks for the String with the same value in the JVM string pool,
if found it returns the reference else it creates the String object and then places it in the String pool.
This way JVM saves a lot of space by using the same String in different threads. But if a new operator is used,
it explicitly creates a new String in the heap memory.
4) + operator is overloaded for String and used to concatenate two Strings.
Although internally it uses StringBuffer to perform this action.

String vs StringBuffer vs StringBuilder

1) String is immutable whereas StringBuffer and StringBuider are mutable classes.
2) StringBuffer is thread safe and synchronized whereas StringBuilder is not, thats why StringBuilder
is more faster than StringBuffer.
3) String concat + operator internally uses StringBuffer or StringBuilder class.
4) For String manipulations in non-multi threaded environment, we should use StringBuilder else use StringBuffer class.

 */