package Module11.Hard3;

import java.util.Arrays;

public class ArrayList<T> implements List<T> {
    private final static int ARRAY_SIZE = 10;
    private Object[] array;
    private int size;

    public ArrayList() {
        size = 0;
        array = new Object[ARRAY_SIZE];
    }

    public boolean add(T element) {
        if (size == array.length) {
            array = Arrays.copyOf(array, array.length * 2);
        }
        array[size] = element;
        size++;
        return true;
    }

    public T get(int index) {
        if (!indexCheck(index)) {
            return null;
        }
        return (T) array[index];
    }

    public T remove(int index) {
        if (!indexCheck(index)) {
            return null;
        }
        T value = (T) array[index];
        array[index] = null;
        size -= 1;
        array = Arrays.copyOf(array, array.length - 1);
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
