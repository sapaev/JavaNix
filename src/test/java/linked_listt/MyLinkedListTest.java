package linked_listt;


import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

class MyLinkedListTest {
    private MyLinkedList<Integer> intList = new MyLinkedList<>();
    private MyLinkedList<String> strList = new MyLinkedList<>();

    @org.junit.jupiter.api.Test
    void of() {
        intList = intList.of(13, 377, 154);

        assertTrue(intList.get(0).equals(13));
        assertTrue(intList.get(1).equals(377));
        assertTrue(intList.get(2).equals(154));
    }

    @org.junit.jupiter.api.Test
    void add() {
        int firstValue = 3;
        int secondValue = 32;
        int thirdValue = 5;

        intList.add(firstValue);
        intList.add(secondValue);
        intList.add(thirdValue);

        int firstElement = intList.get(0);
        int secondElement = intList.get(1);
        int thirdElement = intList.get(2);

        assertTrue(firstValue == firstElement);
        assertTrue(secondValue == secondElement);
        assertTrue(thirdValue == thirdElement);
    }

    @org.junit.jupiter.api.Test
    void addByIndex() {
        int initialSize = 10;
        IntStream.range(0, initialSize).forEach(intList::add);
        assertTrue(intList.size() == initialSize);

        int min = 50;
        int max = 1000;
        int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);

        int index = 3;

        intList.add(3, random_int);

        assertTrue(intList.size() == initialSize + 1);

        assertTrue(intList.get(index) == random_int);
    }

    @org.junit.jupiter.api.Test
    void set() {
        intList.add(1);
        intList.add(2);
        intList.add(3);

        int min = 50;
        int max = 1000;
        int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);

        int index = 2;

        intList.set(2, random_int);

        assertTrue(intList.get(index) == random_int);
    }

    @org.junit.jupiter.api.Test
    void get() {
        int min = 50;
        int max = 1000;
        int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);

        intList.add(1);
        intList.add(random_int);
        intList.add(3);

        assertTrue(intList.get(1) == random_int);
    }

    @org.junit.jupiter.api.Test
    void getFirst() {
        strList.add("first");
        strList.add("second");
        strList.add("third");

        assertTrue(strList.getFirst().equals("first"));
    }

    @org.junit.jupiter.api.Test
    void getLast() {
        strList.add("first");
        strList.add("second");
        strList.add("third");

        assertTrue(strList.getLast().equals("third"));
    }

    @org.junit.jupiter.api.Test
    void remove() {
        String firstStr = "first";
        String secondStr = "second";
        String thirdStr = "third";

        strList.add(firstStr);
        strList.add(secondStr);
        strList.add(thirdStr);

        String removedElement = strList.remove(1);

        assertTrue(removedElement.equals(secondStr));
        assertTrue(strList.size() == 2);
    }

    @org.junit.jupiter.api.Test
    void size() {
        int endExclusive = 10;
        IntStream.range(0, endExclusive).forEach(intList::add);
        assertTrue(intList.size() == endExclusive);
    }

    @org.junit.jupiter.api.Test
    void clear() {
        IntStream.range(0, 10).forEach(intList::add);
        assertTrue(intList.size() > 0);
        intList.clear();
        assertTrue(intList.size() == 0);
    }
}