package linked_listt;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.stream.Stream;
public class MyLinkedList <T> implements MyList<T> {
    private Node<T> first;
    private Node<T> last;
    private int size;

    static class Node<T> {
        public T element;
        public Node<T> next;
        public Node (T element) {
            this.element = element;
        }
    }
    /**
     * This method creates a list of provided elements
     */
    public static <T> MyLinkedList<T> of(T... elements) {
        MyLinkedList<T> myLinkedList = new MyLinkedList<>();
        Stream.of(elements).forEach(myLinkedList::add);
        return myLinkedList;
    }

    /**
     * Adds an element to the end of the list.
     */
    @Override
    public void add(T element) {
        Node<T> newNode = new Node<>(element);
        if (first == null) {
            first = last = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }
        size++;
    }

    /**
     * Adds a new element to the specific position in the list.
     */
    @Override
    public void add(int index, T element) {
        Objects.checkIndex(index, size + 1);
        Node<T> newNode = new Node<>(element);
        if (first == null) {
            first = last = newNode;
        } else if (index == 0) {
            newNode.next = first;
            first = newNode;
        } else if (index == size) {
            last.next = newNode;
            last = newNode;
        } else {
            Node<T> prevNode = findNodeByIndex(index - 1);
            newNode.next = prevNode.next;
            prevNode.next = newNode;
        }
        size++;
    }

    /**
     * Changes the value of an list element at specific position.
     */
    @Override
    public void set(int index, T element) {
        Objects.checkIndex(index, size);
        findNodeByIndex(index).element = element;
    }

    /**
     * Retrieves an elements by its position index.
     */
    @Override
    public T get(int index) {
        Objects.checkIndex(index, size);
        return findNodeByIndex(index).element;
    }

    /**
     * Returns the first element of the list.
     */
    @Override
    public T getFirst() {
        if (first == null) throw new NoSuchElementException();
        return first.element;
    }

    /**
     * Returns the last element of the list.
     */
    @Override
    public T getLast() {
        if (first == null) throw new NoSuchElementException();
        return last.element;
    }


    /**
     * Removes an elements by its position index.
     */
    @Override
    public T remove(int index) {
        Objects.checkIndex(index, size);

        T removedElement;

        if (index == 0) {
            removedElement = first.element;
            first = first.next;
            if (first == null) {
                last = null;
            }
        } else {
            Node<T> prevNode = findNodeByIndex(index - 1);
            removedElement = prevNode.next.element;
            prevNode.next = prevNode.next.next;
            if (index == size - 1) {
                last = prevNode;
            }
        }

        size--;

        return removedElement;
    }

    /**
     * Returns the number of elements in the list
     *
     * @return number of elements
     */
    @Override
    public int size() {
        return size;
    }

    /**
     * Removes all list elements
     */
    @Override
    public void clear() {
        first = last = null;
        size = 0;
    }

    /**
     * Find node by its position index.
     */
    private Node<T> findNodeByIndex(int index) {
        Node<T> current = first;

        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        return current;
    }

}

