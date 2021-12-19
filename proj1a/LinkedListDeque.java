public class LinkedListDeque<T> {
    private StuffNode sentinel;
    private int size;

    private class StuffNode {
        public T item;
        public StuffNode left;
        public StuffNode right;

        public StuffNode(T i, StuffNode l, StuffNode r) {
            item = i;
            left = l;
            right = r;
        }
    }

    public LinkedListDeque() {
        sentinel = new StuffNode(null, null, null);
        size = 0;
    }

    public LinkedListDeque(T x) {
        sentinel = new StuffNode(null, null, null);
        sentinel.right = new StuffNode(x, sentinel, sentinel);
        sentinel.left = sentinel.right;
        size = 1;
    }


    public void addFirst(T item) {
        sentinel.right = new StuffNode(item, sentinel, sentinel.right);
        sentinel.right.right.left = sentinel.right;
        size++;
    }

    public void addLast(T item) {
        sentinel.left = new StuffNode(item, sentinel.left, sentinel);
        sentinel.left.left.right = sentinel.left;
        size++;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int size() {
        return size;
    }

    public void printDeque() {
        StuffNode temp = sentinel.right;
        for (int i = 0; i < size; i++) {
            System.out.print(temp.item + " ");
            temp = temp.right;
        }
        System.out.println();
    }

    public T removeFirst() {
        if (sentinel.right == null) {
            return null;
        } else {
            T temp = sentinel.right.item;
            sentinel.right.left = sentinel;
            sentinel.right = sentinel.right.right;
            size--;
            return temp;
        }
    }

    public T removeLast() {
        if (sentinel.left == null) {
            return null;
        } else {
            T temp = sentinel.left.item;
            sentinel.left.right = sentinel;
            sentinel.left = sentinel.left.right;
            size--;
            return temp;
        }
    }

    public T get(int index) {
        StuffNode temp = sentinel;
        int i = 0;
        while (i < index) {
            temp = temp.right;
            i++;
        }
        return temp.item;
    }

    public T getRecursive(int index) {
        if (size < index) {
            return null;
        }
        return getRecursive(sentinel.right, index);
    }

    private T getRecursive(LinkedListDeque<T>.StuffNode node, int i) {
        if (i == 0) {
            return node.item;
        }
        return getRecursive(node.right, i - 1);
    }
}