package basics;

public class NumericMethods {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        // Integer.max(int a, int b);
        System.out.println( Integer.max(a,b) );  // gives the max value

        System.out.println("___________________________");
        // Integer.compare(int a, int b);
        System.out.println( Integer.compare(a,b) ); // returns -1 if first value is smaller
        System.out.println( Integer.compare(a,a) ); // returns 0 if both numbers are equal
        System.out.println( Integer.compare(b,a) ); // returns 1 if first value is greater

//        if (Integer.compare(a,b) == -1){
//            System.out.println("a is smaller");
//        } else {
//            System.out.println("b is greater");
//        }

        System.out.println("___________________________");

        String age = "19";
        System.out.println(Integer.valueOf(age));  // gives Integer age = 19;   i.e. object
        System.out.println(Integer.parseInt(age)); // gives int age = 19   i.e. primitive
        System.out.println("___________________________");
    }
}
