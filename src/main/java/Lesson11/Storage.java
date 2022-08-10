package Lesson11;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Storage<T> implements Repository<T> {
    private Map<Integer, T> data = new HashMap<>();

    public List<T> getAllData () {
        return data.values().stream().collect(Collectors.toList());
    }

    @Override
    public void add(int id, T item) {
        data.put(id, item);
    }

    @Override
    public T get(int id) {
        return data.get(id);
    }

    @Override
    public T delete(int id) {
        return data.remove(id);
    }

    @Override
    public void update(int id, T value) {
        data.replace(id ,value);
    }
}
