package basics;

public class NestedWhileLoop {

    public static void main(String[] args) {


//        int i = 0;
//        while (i < 7){
//            int j = 0;
//            while (j < i){
//                System.out.print("*");
//                j++;
//            }
//            System.out.println();
//            i++;
//        }

        int a = 7;
        while(a > 0){
            int b = a;
            while(b > 0){
                System.out.print("*");
                b--;
            }
            System.out.println();
            a--;
        }

        }
    }

