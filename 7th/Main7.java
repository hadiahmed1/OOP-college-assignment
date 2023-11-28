import java.util.Iterator;

class DataStructure<T> implements Iterable<T> {
    private T[] elements;

    public DataStructure(T[] elements) {
        this.elements = elements;
    }

    @Override
    public Iterator<T> iterator() {
        return new EvenIterator();
    }

    private class EvenIterator implements Iterator<T> {
        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < elements.length;
        }

        @Override
        public T next() {
            T element = elements[currentIndex];
            currentIndex += 2; // Move to the next even index
            return element;
        }
    }
}

public class Main7 {
    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        DataStructure<Integer> dataStructure = new DataStructure<>(array);

        // Using the EvenIterator to iterate through even-indexed elements
        for (Integer element : dataStructure) {
            System.out.println(element);
        }
    }
}
