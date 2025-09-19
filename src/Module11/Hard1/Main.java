package Module11.Hard1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Integer> hashSet1 = new HashSet<>(Arrays.asList(1, 5, 7));
        Set<Integer> hashSet2 = new HashSet<>(Arrays.asList(1, 6, 8));
        Set<Integer> symmetricDifference = new HashSet<>(hashSet1);
        symmetricDifference.addAll(hashSet2);
        Set<Integer> intersection = new HashSet<>(hashSet1);
        intersection.retainAll(hashSet2);
        symmetricDifference.removeAll(intersection);
        System.out.println(symmetricDifference);
    }
}
