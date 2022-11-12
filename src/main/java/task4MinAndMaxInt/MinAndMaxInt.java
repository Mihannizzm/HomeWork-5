package task4MinAndMaxInt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MinAndMaxInt {

    public static void main(String[] args) {

        Integer[] arrayInt = {0, 15, 48, -300, 64, 48};

        ArrayList<Integer> arrayListInteger = new ArrayList<>(Arrays.asList(arrayInt));
        System.out.println("Минимальное число = " + Collections.min(arrayListInteger) +
                ", Максимальное число = " + Collections.max(arrayListInteger));
    }
}
