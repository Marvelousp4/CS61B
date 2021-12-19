package SLList;

public class SLList_advanced {
    /*the first item(if it exists) is at sentinel.next. */
    private IntNode sentinel;
    private int size;

    private static class IntNode {
        public int item;
        public IntNode next;

        public IntNode(int i, IntNode n) {
            item = i;
            next = n;
        }
    }

    public SLList_advanced(){
        /*sentinel的item我们可以随便设置，因为我们永远不会用到这个哨兵的值 */
        sentinel = new IntNode(63,null);
        size = 0;
    }

    public SLList_advanced(int x){
        sentinel = new IntNode(63,null);
        sentinel.next = new IntNode(x,null);
        size = 1;
    }

    public void addFirst(int x){
        sentinel.next = new IntNode(x,sentinel.next);
        size += 1;
    }

    /* Returns the first item in the list */
    public int getFirst(){
        return sentinel.next.item;
    }

    public void addLast(int x){
        IntNode p = sentinel;

        while (p.next != null){
            p = p.next;
        }
        p.next = new IntNode(x,null);
        size += 1;
    }

    public int size(){
        return size;
    }

    /*测试SLList_advanced类 */
    public  static void main (String[] args){
        /* creates a list of one integer, namely 10*/
        SLList L = new SLList(10);
        L.addFirst(5);
        L.addFirst(14);

        System.out.println( L.size());

    }
}