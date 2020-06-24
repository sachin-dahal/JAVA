package basics;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FirstArrayList {
    public static void main(String[] args) {

        //ArrayList<Integer> list = new ArrayList<Integer>();
        List<Integer> list = new ArrayList<Integer>();

//        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);  // 1, 2, 3

        System.out.println(Arrays.toString(list.toArray())); // 1, 2, 3

        System.out.println(list.get(2)); // 3 is in index 2

        list.set(0,5); // 5, 2, 3
        System.out.println(list);

        System.out.println(list.size()); // 3

        list.add(0, 1);
        System.out.println(list); // 1, 5, 2, 3

        System.out.println(list.indexOf(5)); // 1

        // contains() return boolean value
        System.out.println(list.contains(6)); // -1 (false)
        System.out.println(list.contains(3)); // 1 (true)

        if (list.isEmpty()){
            System.out.println("List is empty");
        } else {
            System.out.println("List has items");
        }

        list.remove(1);
        System.out.println(list); // 1, 2, 3

        list.clear(); // clears the list





    }
}
