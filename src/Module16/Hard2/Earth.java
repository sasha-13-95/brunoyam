package Module16.Hard2;

public class Earth {
    private Earth() {
    }

    private static class Singleton {
        private static Earth earth = new Earth();
    }

    public static Earth getEarth() {
        return Singleton.earth;
    }
}
