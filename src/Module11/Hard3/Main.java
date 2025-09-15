package Module11.Hard3;


public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList();
        arrayList.add("Первая строка для Array List");
        arrayList.add("Вторая строка для Array List");
        System.out.println(arrayList.get(0));
        arrayList.remove(1);
        System.out.println(arrayList.size());
        LinkedList<String> linkedList = new LinkedList();
        linkedList.add("Первая строка для Linked List");
        linkedList.add("Вторая строка для Linked List");
        linkedList.add("Третья строка для Linked List");
        System.out.println(linkedList.size());
        System.out.println(linkedList.get(1));
        System.out.println(linkedList.remove(2));
        System.out.println(linkedList.size());
    }
}
