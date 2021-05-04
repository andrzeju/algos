package pl.com.urbanlab.bootcamp.datastructures;

public class DynamicArray<S> {

    private Object [] array;
    private int size;

    public DynamicArray(int size) {
        array = new Object[size];
    }

    public void set(int i, S value) {
        array[i] = value;
    }

    public S get(int i) {
        return (S) array[i];
    }

    public void add(S value) {
        expandIfNeeded();
        array[size] = value;
        size++;
    }

    public void insert(int index, S value) {
        expandIfNeeded();

        for (int j = size; j > index; j--) {
            array[j] = array[j-1];
        }
        array[index] = value;
        size++;
    }

    private void expandIfNeeded() {
        if (array.length == size) {
            Object [] tempArray = new Object[2 * size];
            for (int i = 0; i < size; i++) {
                tempArray[i] = array[i];
            }
            array = tempArray;
        }
    }

    public int size() {
        return size;
    }

    public void delete(int index) {
        for (int j = index; j < size - 1; j++) {
            array[j] = array[j+1];
        }
        array[size - 1] = null;
        size--;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean contains(S object) {
        for (Object o : array) {
            if (object.equals(o)) {
                return true;
            }
        }
        return false;
    }
}
