package disc02;

public class IntList {
    private int first;
    private IntList rest;

    public IntList(int first, IntList rest) {
        this.first = first;
        this.rest = rest;
    }

    public IntList() {
        this(0, null);
    }

    public static IntList square(IntList L) {
        if (L == null) {
            return L;
        } else {
            IntList rest = square(L.rest);
            IntList M = new IntList(L.first * L.first, rest);
            return M;
        }
    }

    public static IntList sqaureMutative(IntList L){
       IntList B = L;
       while(B != null){
           B.first *= B.first;
           B = B.rest;
       }
       return L;
    }
}
