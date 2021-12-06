package AList;

public class AList {
    int size;
    int[] items;


    public AList(){
        items = new int[100];
        size = 0;
    }

    public void addLast(int x){
        items[size++] = x;
    }

    public int getLast(){
        return items[size - 1];
    }

    public int get(int i){
        return items[i];
    }

    public int size() {
        return size;
    }
}
