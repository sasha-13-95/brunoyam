package Module16.Hard1;

public class Main {
    public static void main(String[] args) {
        Magazine magazine = new Magazine();
        Subscriber subscriber1 = new Subscriber("Женя", magazine);
        Subscriber subscriber2 = new Subscriber("Даня", magazine);
        Subscriber subscriber3 = new Subscriber("Эмма", magazine);
        magazine.addSubscriber(subscriber1);
        magazine.addSubscriber(subscriber2);
        magazine.addSubscriber(subscriber3);
        magazine.publicationOfANewIssue("номер №15");
    }
}
