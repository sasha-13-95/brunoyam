package Module16.Hard1;


public interface Observable {
    void addSubscriber(Subscriber subscriber);

    void notifySubscriber();
}
