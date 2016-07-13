package day4.OwnList;

import org.omg.CORBA.NO_IMPLEMENT;

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
        Node n = new Node();
        n.o = obj;
        if (root == null){
            root = n;
        }else {
            Node last = root;
            Node cp = root;
            while (cp.ref != null){
                last = cp;
                cp = cp.ref;
            }
            last.ref = n;
        }
        size++;

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
