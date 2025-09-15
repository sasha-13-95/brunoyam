package Module11.Middle4;

public class Country implements Comparable<Country> {
    private String name;

    public Country(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Country o) {
        if (this.name.equals("Греция")) return -1;
        return this.name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return name;
    }

    public String getName() {
        return name;
    }
}
