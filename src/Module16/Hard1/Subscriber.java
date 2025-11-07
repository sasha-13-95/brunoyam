package Module16.Hard1;

public class Subscriber implements Observe {
    private String name;
    private Magazine magazine;

    public Subscriber(String name, Magazine magazine) {
        this.name = name;
        this.magazine = magazine;
    }

    @Override
    public void update() {
        System.out.println("Подписчик " + name + " получил уведомление о выходе " + magazine.getNewRelease() + " журнала.");
    }
}
