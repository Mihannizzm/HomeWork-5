package task3House;

import java.util.*;

public class House {

    public static void main(String[] args) {
        Map<String, Integer> tenantsOfHouse = new HashMap<>();

        tenantsOfHouse.put("Иванов Геральт Владимирович", 48);
        tenantsOfHouse.put("Петров Лютик Леонидович", 33);
        tenantsOfHouse.put("Кузнецова Трис Ивановна", 16);
        tenantsOfHouse.put("Ломаева Йенифер Георгиевна", 18);
        tenantsOfHouse.put("Петров Весемир Андреевич", 88);

        List<String> oldTenantsOfHouse = new ArrayList<>();
        tenantsOfHouse.forEach((key, value) -> {
            if (value >= 18) {
                oldTenantsOfHouse.add(key);
            }
        });

        Collections.sort(oldTenantsOfHouse);
        System.out.println(oldTenantsOfHouse);

    }
}
