package Module8.Middle3.Exercises;


public class JumpingRope extends Exercise {
    private static final int MET = 10; // Коэффициент MET (метаболический эквивалент), при беге варьируется от 8 до 12, я взяла ср. значение

    @Override
    public void kcalCounting(int weight, int minutes) {
        float numberOfKcal = (METABOLIC_RATE * MET * weight / CONVERSION_FACTOR) * minutes;
        System.out.println("За " + minutes + " минут ты потерял " + numberOfKcal + " ккал.");
    }
}
