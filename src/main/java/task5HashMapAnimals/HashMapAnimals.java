package task5HashMapAnimals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapAnimals {

    public static void main(String[] args) {

        Map<String, Integer> cats = new HashMap<>();

        cats.put("Вася", 4);
        cats.put("Барсик", 14);

        Map<String, Integer> dogs = new HashMap<>();

        dogs.put("Шарик", 4);
        dogs.put("Рекс", 10);

        Map<String, Integer> animals = new HashMap<>();

        animals.putAll(cats);
        animals.putAll(dogs);
        System.out.println(animals);

    }
}
