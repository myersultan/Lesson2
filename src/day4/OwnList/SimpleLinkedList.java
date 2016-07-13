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

        Node n = new Node();
        n.o = obj;
        if (root != null){
            n.ref = root;
        }
        root = n;
        size ++;

    }

    public void addLast(Object obj){
        Node n = new Node();
        n.o = obj;
        if (root == null){
            root = n;
        } else {
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
        Node previous = null;
        Node cp = root;

        do {
            if (cp.o == prev){
                previous = cp;
                break;
            }
            cp = cp.ref;
        } while (cp != null && cp.ref != null);

        if (previous == null){
            throw new IllegalStateException("List does not contain prev object.");
        }

        Node n = new Node();
        n.o = obj;
        if (previous.ref != null){
            n.ref = previous.ref;
        }
        previous.ref = n;
        size++;

    }

    public int getSize(){
        return size;
    }

    public void printList(){
        if (size == 0){
            System.out.println("List is empty");
        }

        System.out.print("{ ");
        Node cp = root;
        while (cp.ref != null){
            System.out.print(cp.o + ", ");
            cp = cp.ref;
        }
        System.out.print(cp.o);
        System.out.println(" }");
    }

    private class Node{
        Object o;
        Node ref;
    }

    private class SLLIterator {
        private Node node;
    }
}
