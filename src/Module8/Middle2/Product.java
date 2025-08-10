package Module8.Middle2;

import static Module8.Middle2.Fridge.*;

public abstract class Product {

    public boolean putInFrige(String productName, int productVolume) {
        if (remainingSpace - productVolume < 0) {
            System.out.println("Места в холодильнике больше нет");
            freeSpace = false;
        }
        if (remainingSpace - productVolume >= 0) {
            System.out.println("Ты выбрал " + productName + ", он занимает " + productVolume + " % объема");
            remainingSpace -= productVolume;
            System.out.println("Осталось " + remainingSpace + " % объема холодильника");
        }
        return freeSpace;
    }
}

