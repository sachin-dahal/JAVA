package basics;

import java.util.Arrays;

public class ArraysMethods {
    public static void main(String[] args) {
        int[] num = {1,7,2,4,6,9,3,8,5,0};
        int[] num2 = num;
        System.out.println(Arrays.toString(num));

        // sorting alphabetically
        Arrays.sort(num);  //Arrays.parallelSort(num)
        System.out.println(Arrays.toString(num));

        if (Arrays.equals(num, num2)){
            System.out.println("Arrays are equal.");
        }

        Arrays.fill(num, 1);  // fills an array with the given element

        System.out.println(Arrays.toString(num));
    }
}
