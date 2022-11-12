package task2ArrayListString;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListString {

    public static void main(String[] args) {
        ArrayList<String> arrayListString = new ArrayList<>();

        arrayListString.add("Геральт");
        arrayListString.add("Лютик");
        arrayListString.add("Трис");
        arrayListString.add("Йеннифер");
        arrayListString.add("Весемир");
        System.out.println(arrayListString);

        Collections.sort(arrayListString);
        System.out.println(arrayListString);

        Collections.sort(arrayListString, Collections.reverseOrder());
        System.out.println(arrayListString);

        arrayListString.clear();
        System.out.println(arrayListString);
    }
}
