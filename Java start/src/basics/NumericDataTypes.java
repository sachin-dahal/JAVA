package basics;

public class NumericDataTypes {
    public static void main(String[] args) {

        System.out.println(Math.pow(2,3));
        System.out.println(Math.pow(123567,2));
        System.out.println(Math.pow(99999999,99999999));  // if excludes int value then gives Infinity


        System.out.println(Math.sqrt(4));
        System.out.println(Math.sqrt(3));
        System.out.println(Math.sqrt(-1));  // it is not a number. Hence, gives NaN
    }
}
