package Module11.Middle4;


import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        List<Country> listOfCountries = new ArrayList<>();
        listOfCountries.add(new Country("Россия"));
        listOfCountries.add(new Country("Китай"));
        listOfCountries.add(new Country("США"));
        listOfCountries.add(new Country("Италия"));
        listOfCountries.add(new Country("Южная Корея"));
        listOfCountries.add(new Country("Япония"));
        listOfCountries.add(new Country("Австралия"));
        listOfCountries.add(new Country("Греция"));
        listOfCountries.add(new Country("Тунис"));
        listOfCountries.add(new Country("Мексика"));
        TreeSet<Country> setOfCountries = new TreeSet<>(listOfCountries);
        System.out.println(setOfCountries);

    }
}
