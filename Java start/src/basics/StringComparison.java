package basics;
import java.util.Scanner;

public class StringComparison {
    public static void main(String[] args) {

        String password = "hello world";

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the pw: ");
        String enterPW = sc.nextLine();

        System.out.println(password.equals(enterPW));  // compares the value of objects
        System.out.println(password == enterPW);  // compares the memory location in terms of objects (string is an object)

        //System.out.println((char) password.compareTo(enterPW));

    }
}
