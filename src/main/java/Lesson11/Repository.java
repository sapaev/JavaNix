package Lesson11;

public interface Repository<T> {
    void add (int id, T item);

    T get (int id);

    T delete (int id);

    void update (int id, T item);
}
