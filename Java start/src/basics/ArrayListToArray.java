package basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListToArray {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        System.out.println("ArrayList: "+list);

        int[] listArray = new int[list.size()];

        for (int i = 0; i < list.size(); i++){
            listArray[i] = list.get(i);
        }
        System.out.println("Array: "+Arrays.toString(listArray));
    }
}
