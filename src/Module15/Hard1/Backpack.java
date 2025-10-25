package Module15.Hard1;

import java.util.ArrayList;
import java.util.List;

public class Backpack {
    private List<Thing> thingsInMyBackpack;
    private int numberOfThings;
    private int countValue = 0;

    public Backpack(int numberOfThings) {
        this.numberOfThings = numberOfThings;
        thingsInMyBackpack = new ArrayList<>(numberOfThings);
    }

    public void addItemToBackpack(List<Thing> allMyThings) {
        for (int i = 0; i < numberOfThings; i++) {
            thingsInMyBackpack.add(allMyThings.get(i));
            countValue = countValue + allMyThings.get(i).getValue();
        }
    }

    public int getCountValue() {
        return countValue;
    }
}
