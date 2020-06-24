package basics;

import java.util.Scanner;

public class ScannerInput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Enter your height: ");
        int height = (int) sc.nextDouble();
        double height1 = height;

        System.out.println("Your height: "+height);
        System.out.println("Your height: "+height1);

//        int binaryInput = sc.nextInt(2);    // binary input
//        System.out.println(binaryInput);
//
//        int octalInput = sc.nextInt(8); // octal input
//        System.out.println(octalInput);

//        System.out.println("What is your name?");
//        String name = sc.nextLine();
//
//        System.out.print("Enter your age: ");
//        int age = sc.nextInt();
//
//        System.out.print("Enter your gender: ");
//        String gender = sc.next();
//
//        System.out.println("Hello Mr. "+name);
//        System.out.println("You are "+age+" years old "+ gender+".");

    }
}
