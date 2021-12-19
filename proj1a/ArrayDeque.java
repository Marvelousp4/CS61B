public class ArrayDeque<T> {
    private T[] items;
    private int size;
    private int capacity = 8;
    private int front;


    public ArrayDeque() {
        items = (T[]) new Object[capacity];
        front = 0;
        size = 0;
    }

    private void resize(int newSize, int i) {
        if (newSize < 0) {
            return;
        }
        T[] newArray = (T[]) new Object[newSize];
        int j = i;
        while (i < size + j) {
            if (front == capacity) {
                front = 0;
            }
            newArray[i++] = items[front++];
        }
        items = newArray;
    }


    public T get(int index) {
        int temp = (front + index) % capacity;
        return items[temp];
    }


    public void addFirst(T item) {
        if (capacity == size) {
            resize(capacity + 1, 1);
            items[0] = item;
            size++;
            return;
        }
        int index = (front - 1 + capacity) % capacity;
        items[index] = item;
        size++;
        front = index;
    }


    public void addLast(T item) {
        if (capacity == size) {
            resize(capacity + 1, 0);
        }
        int index = (front + size) % capacity;
        items[index] = item;
        size++;
    }


    public boolean isEmpty() {
        return size == 0;
    }


    public int size() {
        return size + 1;
    }


    public void printDeque() {
        int i = 0;
        int temp = front;
        while (i < size) {
            if (temp == capacity) {
                temp = 0;
            }
            System.out.printf("%d ", items[temp++]);
            i++;
        }
        System.out.println();
    }


    public T removeFirst() {
        if (size == 0) {
            return null;
        }
        size--;
        T temp = items[front];
        if (front != capacity) {
            front++;
        } else {
            front = 0;
        }
        return temp;
    }


    public T removeLast() {
        if (size == 0) {
            return null;
        }
        T temp;
        if (front == 0) {
            temp = items[size - 1];
            items[size - 1] = null;
        } else {
            int index = (front + size) % capacity;
            temp = items[index - 1];
            items[index] = null;
        }
        size--;
        return temp;
    }
}
