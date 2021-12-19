import java.util.AbstractList;

public class ArrayDeque<Item> extends AbstractList<Item> implements Deque<Item> {
    private Item[] items;
    private int size;
    private int capacity = 8;
    private int front;


    public ArrayDeque() {
        items = (Item[]) new Object[capacity];
        front = 0;
        size = 0;
    }

    public void resize(int newSize, int i) {
        Item[] newArray = (Item[]) new Object[newSize];
        int j = i;
        while (i < size + j) {
            if (front == capacity) {
                front = 0;
            }
            newArray[i++] = items[front++];
        }
        items = newArray;
    }


    public Item get(int index) {
        return items[index];
    }


    public void addFirst(Item item) {
        if (capacity == size) {
            resize(capacity + 1, 1);
            items[0] = item;
            return;
        }
        int index = (front - 1 + capacity) % capacity;
        items[index] = item;
        size++;
        front = index;
    }


    public void addLast(Item item) {
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
        return size;
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


    public Item removeFirst() {
        size--;
        Item temp = items[front];
        if (front != capacity) {
            front++;
        } else {
            front = 0;
        }
        return temp;
    }


    public Item removeLast() {
        Item temp;
        if (front == 0) {
            temp = items[size - 1];
            items[size - 1] = null;
        }
        else {
            int index = (front + size) % capacity;
            temp = items[index - 1];
            items[index] = null;
        }
        size--;
        return temp;
    }
}