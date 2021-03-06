import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArrayDequeTest {
    @Test
    public void testDeque() {
        ArrayDeque items = new ArrayDeque();
    }

    @Test
    public void testEmpty() {
        ArrayDeque test = new ArrayDeque();
        assertEquals(true, test.isEmpty());
    }


    @Test
    public void testPrint() {
        ArrayDeque test = new ArrayDeque();
        for (int i = 0; i < 8; i++) {
            test.addLast(i);
        }
        test.addFirst(-1);
        test.printDeque();
    }

    @Test
    public void testRemove() {
        ArrayDeque test = new ArrayDeque();
        test.addLast(2);
        test.addLast(3);
        test.addFirst(1);
        test.printDeque();
        int a = (int) test.removeLast();
        System.out.println(a);
        test.printDeque();
        int b = (int) test.removeFirst();
        test.printDeque();
    }

    @Test
    public void testGet() {
        ArrayDeque test = new ArrayDeque();
        test.addLast(3);
        test.addLast(4);
        int a = (int) test.get(0);
        System.out.println(a);
    }

    @Test
    public void test() {
        ArrayDeque test = new ArrayDeque();
        for (int i = 0; i < 10; i++) {
            test.addFirst(i);
        }
        test.isEmpty();
        int b = (int) test.get(1);
        int c = (int) test.get(2);
        test.size();

        System.out.println(test.removeFirst());
        System.out.println(test.removeLast());
        test.addLast("A");
    }
}
