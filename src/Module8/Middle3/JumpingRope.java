package Module8.Middle3;

public class JumpingRope extends Exercises {
    private static final float METABOLIC_RATE = 3.5f; // Константа, представляющая собой скорость метаболизма
    private static final int MET = 10; // Коэффициент MET (метаболический эквивалент), при беге варьируется от 8 до 12, я взяла ср. значение
    private static final int CONVERSION_FACTOR = 200; // Константа, представляющая собой коэффициент перевода в ккал

    @Override
    public void kcalCounting(int weight, int minutes) {
        float numberOfKcal = (METABOLIC_RATE * MET * weight / CONVERSION_FACTOR) * minutes;
        System.out.println("За " + minutes + " минут ты потерял " + numberOfKcal + " ккал.");
    }
}
