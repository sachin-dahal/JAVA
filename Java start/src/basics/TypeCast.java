package basics;

public class TypeCast {

    // cast the value to another type

    public static void main(String[] args) {

        long a = 120145678901234L;
        byte b = (byte) a;
        char c = (char) a;  // stores ascii value
        int d = (int) (a);


        String name = "Sachin Dahal";
        String n = name;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(n);
    }
}
