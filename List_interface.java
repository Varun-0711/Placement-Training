public interface List_interface<T> {
    void add(T element);
    void remove(T element);
    T get(int index);
    int size();
    boolean isEmpty();
    boolean contains(T element);
    void clear();
}