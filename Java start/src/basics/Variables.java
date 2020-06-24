package basics;

public class Variables {

    public static final String name = "Sachin Dahal";     // global variable, so that anyone canuse this

    public static void main(String[] args) {
        int a; // variable declaration
        a = 10; // variable initialization
        a = 20; // variable initialization
        System.out.println(a);

        final double PI = 3.14;    // cannot be changed in whole program of this main() block
        //PI = 10;
        System.out.println(PI);
        System.out.println("My name is "+name);
    }
}
