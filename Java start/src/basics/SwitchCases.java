package basics;
import java.util.Scanner;

public class SwitchCases {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the number of day: ");
//        int day = sc.nextInt();
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        switch (name){
            case "sachin":
                System.out.println("Hey Sachin");
                break;
            case "suresh":
                System.out.println("Hey Suresh");
                break;
            case "bishal":
                System.out.println("Hey Bishal");
                break;
            case "nishan":
                System.out.println("Hey Nishan");
                break;
            case "sanjib":
                System.out.println("Hey Sanjib");
                break;
            default:
                System.out.println("Invalid Attempt");

//        switch (day){
//            case 1:
//                System.out.println("Sunday");
//                break;
//            case 2:
//                System.out.println("Monday");
//                break;
//            case 3:
//                System.out.println("Tuesday");
//                break;
//            case 4:
//                System.out.println("Wednesday");
//                break;
//            case 5:
//                System.out.println("Thursday");
//                break;
//            case 6:
//                System.out.println("Friday");
//                break;
//            case 7:
//                System.out.println("Saturday");
//                break;
//            default:
//                System.out.println("Invalid Attempt");

        }
    }
}
