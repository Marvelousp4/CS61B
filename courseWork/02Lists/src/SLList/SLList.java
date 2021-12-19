package SLList;

/**
 * @author Marvelousp4
 */
public class SLList {

    private IntNode first;
    private int size;

    private static class IntNode {
        public int item;
        public IntNode next;

        public IntNode(int i, IntNode n) {
            item = i;
            next = n;
        }
    }

    public SLList(int x){

        first = new IntNode(x,null);
        size += 1;
    }

    /* adds x to the front of the list */
    public void addFirst(int x){
        first = new IntNode(x,first);
        size += 1;
    }

    /* Returns the first item in the list */
    public int getFirst(){
        return first.item;
    }

    public void addLast(int x){
        IntNode p = first;

        while (p.next != null){
            p = p.next;
        }
        p.next = new IntNode(x,null);
        size += 1;
    }


    /* use a variable to count the size. */
    public int size(){
        return size;
    }
}