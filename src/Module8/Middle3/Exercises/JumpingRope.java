package Module8.Middle3.Exercises;


public class JumpingRope extends Exercise {
    private static final int MET = 10; // Коэффициент MET (метаболический эквивалент), при прыжках на скакалке варьируется от 8 до 12, я взяла ср. значение

    @Override
    public float kcalCounting(int weight, int minutes) {
        float numberOfKcal = (METABOLIC_RATE * MET * weight / CONVERSION_FACTOR) * minutes;
        return numberOfKcal;
    }
}
