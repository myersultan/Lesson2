package day4.OwnList;

import java.util.Iterator;

/**
 * Created by admin on 7/15/2016.
 */
public class SimpleArrayList {

    private Object[] theItems;
    private int theSize;

    public SimpleArrayList() {
        theItems = new Object[10];
        theSize = 0;
    }

    public int size(){
        return theSize;
    }

    public Object get(int idx){
        if (idx < 0 || idx >= size())
            throw new ArrayIndexOutOfBoundsException("Index " + idx + "; size" + size());
            return theItems[idx];
    }

    public Object set(int idx, Object newVal){
        if (idx < 0 || idx >= size())
            throw new ArrayIndexOutOfBoundsException("Index " + idx + "; size" + size());
        Object old = theItems[idx];
        theItems[idx] = newVal;

        return old;
    }

    public boolean add(Object x) {
        if (theItems.length == size()){
            Object[] old = theItems;
            theItems = new Object[theItems.length * 2 + 1];
            for (int i = 0; i < size(); i++) {
                theItems[i] = old[i];
            }
        }
        theItems[theSize++] = x;
        return true;
    }

    public Object remove(int idx){
        Object removedItem = theItems[idx];
        for (int i = idx; i < size()-1; i++) {
            theItems[i] = theItems[i+1];
        }
        theSize--;
        return removedItem;
    }
}
