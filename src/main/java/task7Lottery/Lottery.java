package task7Lottery;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Lottery {

    public static void main(String[] args) {

        Integer[] arrayInteger = new Integer[100];

        for (int i = 0; i < arrayInteger.length; i++) {
            arrayInteger[i] = i;
        }

        ArrayList<Integer> arrayListInteger = new ArrayList<>(Arrays.asList(arrayInteger));
        Collections.shuffle(arrayListInteger);

        for (int i = 0; i < 10; i++) {
            System.out.println(arrayListInteger.get(i));
        }
    }

}
