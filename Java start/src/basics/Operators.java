package basics;

public class Operators {

    public static void main(String[] args) {

        // increment - decrement opertors
        int a = 10;
        int b = 20;

        System.out.println(a++); //value is 11 but shows 10
        System.out.println(++a); // added 1 to 11 and gives the exact value of a i.e. 12

        System.out.println(b--); // value is 19 but shows stil 20
        System.out.println(--b); // subtracts 1 from 19 and gives the exact value of b i.e. 18

        System.out.println(a + 5); // 12 + 5

        // a = (double) 2.5;

        System.out.println("--------------------");

        int x = 10;
        int y = ++x;

        System.out.println(y); // 11
        System.out.println(x); // 11

        System.out.println("--------------------");

        x +=10; // 11 + 10 = 21
        //x *= 10;
        //x -= 10;
        System.out.println(x);
    }
}
