package disc02;

public class StringList {
    public String str;
    public StringList next;
    public StringList(String str, StringList L) {
        this.str = str;
        this.next = L;
    }
}
