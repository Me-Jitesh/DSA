package linkedlist.singlylinkedlist;

public class GenericNode<T> {
    public T data;
    public GenericNode<Integer> nxt;

    public GenericNode(T data) {
        this.data = data;
    }
}
