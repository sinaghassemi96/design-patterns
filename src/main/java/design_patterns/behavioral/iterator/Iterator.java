package design_patterns.behavioral.iterator;

import java.util.NoSuchElementException;

public class Iterator<T> {

    private final T[] items;
    private int index;

    public Iterator(T[] items) {
        this.items = items;
    }

    public boolean hasNext() {
        return index < items.length;
    }

    public T next() {
        if (hasNext()) {
            return items[index++];
        }
        else throw new NoSuchElementException("No more elements");
    }

}
