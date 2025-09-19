package Module11.Hard3;

public class LinkedList<T> implements List<T> {
    private Node<T> first;
    private Node<T> last;
    private int size;

    public LinkedList() {
        size = 0;
    }

    private static class Node<T> {
        T element;
        Node<T> prev;
        Node<T> next;

        public Node(Node<T> prev, T element, Node<T> next) {
            this.element = element;
            this.prev = prev;
            this.next = next;
        }
    }

    public boolean add(T element) {
        Node<T> newNode = new Node<>(first, element, null);
        if (first == null) {
            first = newNode;
            last = first;
        } else {
            last.next = newNode;
            newNode.prev = last;
            last = newNode;
        }
        size++;
        return true;
    }

    public T get(int index) {
        if (!indexCheck(index)) {
            return null;
        }
        Node<T> result = first;
        for (int i = 0; i < index; i++) {
            result = result.next;
        }
        return result.element;
    }

    public T remove(int index) {
        if (!indexCheck(index)) {
            return null;
        }
        Node<T> result = first;
        for (int i = 0; i < index; i++) {
            result = result.next;
        }
        Node<T> prevResult = first;
        for (int i = 0; i < index - 1; i++) {
            prevResult = prevResult.next;
        }
        T value = result.element;
        prevResult.next = result.next;
        result = null;
        size--;
        return value;
    }

    public boolean indexCheck(int index) {
        boolean validIndex = true;
        if (index < 0 || index >= size) {
            System.out.println("Элемента с данным индексом не существует");
            validIndex = false;
        }
        return validIndex;
    }

    public int size() {
        return size;
    }
}
