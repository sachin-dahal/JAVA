package basics;

public class StringMethods {
    public static void main(String[] args) {

        String a = "Hey Man";
        String b = " Wassup?";

        System.out.println(a.concat(b)); // concatenates

        System.out.println( (char) a.compareToIgnoreCase(b)); // compares string and returns int type

        System.out.println(a.endsWith("n")); // checks whether string ends with specific character.

        String name1 = "Hello Sachin"; // it is an object or instance of a class
        String name2 = " Dahal";
        String name3 = " World";
        String random = "my name my is my Sachin Dahal and my age is 19";

        System.out.println( name1.charAt(0) ); // returns the value at the (index)
        System.out.println( name1.charAt(4) );

        System.out.println( name1.length() ); // gives the length of a string

        System.out.println(name1 + name2);   // String concatenation

        System.out.println( String.format("Hello %s", name3) );  // formats after %s with the next assigned string value

        System.out.println(random.indexOf("my", random.indexOf("my",random.indexOf("my")+1)+1)); // escape two "my"

        System.out.println(random.lastIndexOf("my"));  // finds last index of my

        System.out.println(random.toUpperCase());  // makes string uppercase

        System.out.println(random.substring(13));  // skip up to the given index and continues from there

        System.out.println(random.replaceAll("my", "MY"));  // finds the value and replaces it

        System.out.println(name3.equals(" World")); // equals means equals
        System.out.println(random.equals("Sachin Dahal"));


        System.out.println(random);


       // https://www.w3schools.com/java/java_ref_string.asp


    }
}
