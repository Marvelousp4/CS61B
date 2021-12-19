import java.util.LinkedList;

public class LinkedListDeque<Item> extends LinkedList<Item> implements Deque<Item> {

    private StuffNode sentinel;
    private int size;

    private class StuffNode {
        public Item item;
        public StuffNode left;
        public StuffNode right;

        public StuffNode(Item i, StuffNode l, StuffNode r) {
            item = i;
            left = l;
            right = r;
        }
    }

    public LinkedListDeque() {
        sentinel = new StuffNode(null, null, null);
        size = 0;
    }

    public LinkedListDeque(Item x) {
        sentinel = new StuffNode(null, null, null);
        sentinel.right = new StuffNode(x, sentinel, sentinel);
        sentinel.left = sentinel.right;
        size = 1;
    }


    @Override
    public void addFirst(Item item) {
        sentinel.right = new StuffNode(item, sentinel, sentinel.right);
        sentinel.right.right.left = sentinel.right;
        size++;
    }

    @Override
    public void addLast(Item item) {
        sentinel.left = new StuffNode(item, sentinel.left, sentinel);
        sentinel.left.left.right = sentinel.left;
        size++;
    }

    @Override
    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void printDeque() {
        StuffNode temp = sentinel.right;
        for (int i = 0; i < size; i++) {
            System.out.print(temp.item + " ");
            temp = temp.right;
        }
        System.out.println();
    }

    @Override
    public Item removeFirst() {
        if (sentinel.right == null) {
            return null;
        } else {
            Item temp = sentinel.right.item;
            sentinel.right.left = sentinel;
            sentinel.right = sentinel.right.right;
            size--;
            return temp;
        }
    }

    @Override
    public Item removeLast() {
        if (sentinel.left == null) {
            return null;
        } else {
            Item temp = sentinel.left.item;
            sentinel.left.right = sentinel;
            sentinel.left = sentinel.left.right;
            size--;
            return temp;
        }
    }

    @Override
    public Item get(int index) {
        StuffNode temp = sentinel;
        int i = 0;
        while (i < index) {
            temp = temp.right;
            i++;
        }
        return temp.item;
    }

    public Item getRecursive(int index) {
        if (size < index) {
            return null;
        }
        return getRecursive(sentinel.right, index);
    }

    private Item getRecursive(LinkedListDeque<Item>.StuffNode node, int i) {
        if (i == 0) {
            return node.item;
        }
        return getRecursive(node.right, i - 1);
    }
}