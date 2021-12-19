import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListDequeTest {
    @Test
    public void testList() {
        LinkedListDeque one = new LinkedListDeque(1);
        LinkedListDeque two = new LinkedListDeque(2);
        LinkedListDeque three = new LinkedListDeque(3);
    }

    @Test
    public void testEmpty() {
        LinkedListDeque test = new LinkedListDeque();
        assertEquals(true, test.isEmpty());
    }


    @Test
    public void testPrint() {
        LinkedListDeque test = new LinkedListDeque(1);
        test.addFirst(2);
        test.addLast(3);
        test.printDeque();
    }

    @Test
    public void testRemove() {
        LinkedListDeque test = new LinkedListDeque(1);
        test.addLast(2);
        test.addLast(3);
        test.printDeque();
        int a = (int) test.removeLast();
        System.out.println(a);
        test.printDeque();
        test.removeFirst();
        test.printDeque();
    }

    @Test
    public void testGet() {
        LinkedListDeque test = new LinkedListDeque(2);
        test.addLast(3);
        test.addLast(4);
        int a = (int) test.get(1);
        int b = (int) test.getRecursive(2);
        System.out.println(a);
        System.out.println(b);
    }
}