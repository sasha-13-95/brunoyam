package Module11.Hard3;

public interface List<T> {
    public abstract boolean add(T element);

    public abstract T get(int index);

    public abstract T remove(int index);

    public boolean indexCheck(int index);

    public int size();
}
