package PUSH_P;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // не использовал предложенный метод создания списка, так как он завязывается на массив
        // и не позволяет испольщовать .remove
        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(5);
        intList.add(16);
        intList.add(-1);
        intList.add(-2);
        intList.add(0);
        intList.add(32);
        intList.add(3);
        intList.add(5);
        intList.add(8);
        intList.add(23);
        intList.add(4);
        intList.removeIf(p -> p <= 0 | p % 2 != 0);
        Collections.sort(intList);
        for (int element : intList) {
            System.out.println(element);

        }
    }
}
