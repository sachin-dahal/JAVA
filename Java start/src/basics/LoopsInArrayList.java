package basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LoopsInArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++){
            list.add(i);
        }
        System.out.println(list);   // 0, 1, 2, 3, 4, 5, 6, 7, 8, 9

        for (int i = 0; i < list.size(); i++){
            list.set(i, list.get(i)* 2 );
        }
        System.out.println(list); // 0, 2, 4, 6, 8, 10, 12, 14, 16, 18


        // for each

        for (int num: list) {
            System.out.print(num+ " ");
        }
        System.out.println();

        // Nested for each looop

        List<List<Integer>> allNum = new ArrayList<List<Integer>>();
        allNum.add(Arrays.asList(1, 2, 3, 4, 5));
        allNum.add(Arrays.asList(6, 7, 8, 9, 10));
        allNum.add(Arrays.asList(11, 12, 13, 14, 15));

        //System.out.print(allNum);
        System.out.println();

        for (List<Integer> num1 : allNum) {
            for (int num2 : num1) {
                System.out.print(num2 + " ");
            }
            System.out.println();
        }

    }
}
