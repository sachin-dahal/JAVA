package basics;

public class TernaryOperator {
    public static void main(String[] args) {

        String name = "Sachin";
        int points = name.equals("Sachin") ? 10 : 0;

        System.out.println(points);

//        int points;
//        if (name.equals("Sachin")){
//            points = 10;
//        } else{
//            points = 0;
//        }
//        System.out.println(points);
    }
}
