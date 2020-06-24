package basics;

public class NestedForLoop {
    public static void main(String[] args) {

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < i; j++) {
                //System.out.print(i);
                System.out.print("*");
            }
            System.out.println();
        }

//        *
//        **
//        ***
//        ****
//        *****

        for (int i = 7; i>0; i--){
            for (int j = i; j > 0; j--){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
