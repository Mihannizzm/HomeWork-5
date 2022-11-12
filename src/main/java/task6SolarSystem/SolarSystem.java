package task6SolarSystem;

import java.util.ArrayList;
import java.util.List;

public class SolarSystem {

    public static void main(String[] args) {

        ArrayList<String> solarSystem = new ArrayList<>();
        solarSystem.add("Mercury");
        solarSystem.add("Venus");
        solarSystem.add("Earth");
        solarSystem.add("Mars");
        solarSystem.add("Jupiter");
        solarSystem.add("Saturn");
        solarSystem.add("Neptune");
        solarSystem.add("Uranus");

        solarSystem.set(6,"Uranus");
        solarSystem.set(7,"Neptune");
        System.out.println(solarSystem);

    }
}
