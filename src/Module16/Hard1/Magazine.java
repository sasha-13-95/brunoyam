package Module16.Hard1;

import java.util.ArrayList;
import java.util.List;

public class Magazine implements Observable {
    private List<Subscriber> subscribers;
    private String newRelease;

    public Magazine() {
        subscribers = new ArrayList<>();
    }

    public void publicationOfANewIssue(String newRelease) {
        this.newRelease = newRelease;
        notifySubscriber();
    }

    @Override
    public void notifySubscriber() {
        for (Subscriber subscriber : subscribers) subscriber.update();
    }

    @Override
    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public String getNewRelease() {
        return newRelease;
    }
}
