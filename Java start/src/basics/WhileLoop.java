package basics;
import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {

         //While loop
        int i = 0;
        while( i<5 ){
            System.out.println("Hello "+ i);  // each loop performed is called iteration
            i++;
        }


        // asks passowrd till the right password is given
//        String password = "hello";
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a password: ");
//        String enterPW = sc.nextLine();
//
//        while( !password.equals(enterPW) ){
//            System.out.print("Enter a password: ");
//            enterPW = sc.nextLine();
//        }
//        System.out.println("Hello World!");


        // 3 try password using while loop
//        String password = "hello";
//        Scanner sc = new Scanner(System.in);
//        int i = 0;
//        while(i<3){
//            System.out.print("Enter a password: ");
//            String enterPW = sc.nextLine();
//
//            if(password.equals(enterPW)){
//                System.out.println("Welcome");
//                //return; // return ends the program
//                break;
//            } else {
//                System.out.println("Sorry");
//            }
//            i++;
//        }
//        System.out.println("Hello World!");

    }
}
