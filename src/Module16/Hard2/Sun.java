package Module16.Hard2;

public class Sun {                       // Для многопоточной среды
    private static volatile Sun sun;

    private Sun() {
    }

    public static Sun getSun() {
        if (sun == null) {
            synchronized (Sun.class) {
                if (sun == null) sun = new Sun();
            }
        }
        return sun;
    }
}
