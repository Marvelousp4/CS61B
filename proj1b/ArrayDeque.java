import java.util.*;

public class ArrayDeque<Item> extends ArrayList<Item> implements Deque<Item> {
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
        while (i < size) {
            if (front == capacity) {
                front = 0;
            }
            newArray[i++] = items[front++];
        }
    }


    @Override
    public Item get(int index) {
        return items[index];
    }

    @Override
    public void addFirst(Item item) {
        if (capacity == items.length) {
            resize(capacity + 1, 1);
        }
        int index = (front - 1) % capacity;
        items[index] = item;
        size++;
        front = index;
    }

    @Override
    public void addLast(Item item) {
        if (capacity == items.length) {
            resize(capacity + 1, 0);
        }
        int index = (front + size) % capacity;
        items[index] = item;
        size++;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void printDeque() {
        int i = 0;
        while (i < size) {
            if (front == capacity) {
                front = 0;
            }
            System.out.println(items[front++]);
            i++;
        }
    }

    @Override
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

    @Override
    public Item removeLast() {
        int index = (front + size - 1) % capacity;
        size--;
        Item temp = items[index];
        return temp;
    }
}