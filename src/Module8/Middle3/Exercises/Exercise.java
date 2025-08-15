package Module8.Middle3.Exercises;

public abstract class Exercise {

    protected static final float METABOLIC_RATE = 3.5f; // Константа, представляющая собой скорость метаболизма
    protected static final int CONVERSION_FACTOR = 200; // Константа, представляющая собой коэффициент перевода в килокалории

    public abstract float kcalCounting(int weight, int minutes);
}
