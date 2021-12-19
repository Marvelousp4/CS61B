package disc02;

public class IntListLaunch {
    public static void main(String[] args) {
        IntList L = new IntList(2, null);
        L = new IntList(3, L);
        IntList M = IntList.square(L);
        IntList.sqaureMutative(L);
    }
}
