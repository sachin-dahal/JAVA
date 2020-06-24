package basics;
import java.util.Scanner;

public class Conditionals {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.print("Chose a pasword: ");
        String password = sc.nextLine();

        System.out.print("Enter a password: ");
        String enterPW = sc.nextLine();

        if(password.equalsIgnoreCase(enterPW)){     // (password.toLowerCase().equals(enterPW.toLowerCase()))
            System.out.println("Welcome");

        }else if ( "master password".equals(enterPW) ){
            System.out.println("You've cracked master password");

        } else {
            System.out.println("Wrong pasword");
        }

    }
}
