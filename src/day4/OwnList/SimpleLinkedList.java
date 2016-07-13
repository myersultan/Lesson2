package day4.OwnList;

/**
 * Created by admin on 7/13/2016.
 */
public class SimpleLinkedList {

    private Node root;
    private int size;

    public SimpleLinkedList(){
        size = 0;
    }

    public void addFirst(Object obj){

        Node node = new Node();
        node.o = obj;
        if (root != null){
            node.ref = root;
        }
        root = node;
        size ++;

    }

    public void addLast(Object obj){

    }

    public void addAfter(Object obj, Object prev){

    }

    public int getSize(){
        return size;
    }

    private class Node{
        Object o;
        Node ref;
    }
}
