package task1ArrayListInt;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListInt {

    public static void main(String[] args) {
        ArrayList<Integer> arrayListInt = new ArrayList<>();

        arrayListInt.add(1);
        arrayListInt.add(14);
        arrayListInt.add(201);
        arrayListInt.add(118);
        arrayListInt.add(10);
        System.out.println(arrayListInt);

        Collections.sort(arrayListInt);
        System.out.println(arrayListInt);

        Collections.sort(arrayListInt, Collections.reverseOrder());
        System.out.println(arrayListInt);

        arrayListInt.clear();
        System.out.println(arrayListInt);
    }


}
