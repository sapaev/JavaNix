package linked_listt;

public interface MyList<T> {
    void add(T element);

    void add(int index, T element);

    void set(int index, T element);

    T get(int index);

    T getFirst();

    T getLast();

    T remove(int index);

    int size();

    void clear();
}
