package basics;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        int sum = 0;

        System.out.println("Enter values for an array: ");
        for (int i =0; i < size; ++i){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        System.out.println(sum);
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++ ){
            System.out.print(arr[i] +" ");
        }

        System.out.println();
        for (int i = 0; i < arr.length; i++){
            if(arr[i] == 4){
                System.out.println("Found!\n It is at index "+i);
            }
        }
    }
}
