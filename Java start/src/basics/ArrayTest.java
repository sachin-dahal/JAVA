package basics;

import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {


        String[] names = {"Sachin", "Suresh","Bishal","Nishan","Sanjib"};

        for (String name: names) {
            System.out.print(name+", ");
        }

        names[0] = "Sachin Dahal";

        System.out.println();
        System.out.println(Arrays.toString(names));


        // deepToString()   to print arrays of array

        int[][] marks = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.deepToString(marks));



//        String[] names = new String[5];
//        names[0] = "Sachin";
//        names[1] = "Suresh";
//        names[2] = "Bishal";
//        names[3] = "Nishan";
//        names[4] = "Sanjib";

//        --------------------

//        String[] name1 = {"Sachin", "Suresh","Bishal","Nishan","Sanjib"};
//        for (int i = 0; i < 5; i++){
//            names[i] = name1[i];
//        }

//        System.out.println(names); // prints the location
    }
}
