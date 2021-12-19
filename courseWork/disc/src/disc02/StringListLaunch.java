package disc02;

public class StringListLaunch {
    public static void main(String[] args) {
        StringList L = new StringList("eat", null);
        L = new StringList("shouldn't", L);
        L = new StringList("you", L);
        StringList M = L.next;
        StringList R = new StringList("many", null);
        R = new StringList("potatoes", R);
        R.next.next = R;
        M.next.next.next = R.next;
        L.next.next = L.next.next.next;
        L = M.next;
    }
}