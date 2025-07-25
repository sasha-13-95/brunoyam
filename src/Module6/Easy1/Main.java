package Module6.Easy1;

public class Main {
    public static void main(String[] args) {
        House house = new House("Линейная,7", "2016");
        System.out.println("Адрес: " + house.getAdress() + ", год постройки: " + house.getConstructionYear());
    }
}

