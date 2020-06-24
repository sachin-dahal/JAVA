package basics;
import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {

        String password = "hello";
        Scanner sc = new Scanner(System.in);
        String enterPW;

        // this always executes for one time
        do {
            System.out.print("Enter a password: ");
            enterPW = sc.nextLine();
        }
        while (!password.equals(enterPW) );
        sc.close();
        System.out.println("Hello World!");

//        String password = "hello";s
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a password: ");
//        String enterPW = sc.nextLine();
//        while( !password.equals(enterPW) ){
//            System.out.print("Enter a password: ");
//            enterPW = sc.nextLine();
//        }
//        System.out.println("Hello World!");
    }
}
