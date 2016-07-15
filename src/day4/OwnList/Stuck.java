package day4.OwnList;

import java.util.LinkedList;
import java.util.Objects;

/**
 * Created by admin on 7/15/2016.
 */
public class Stuck {
    private LinkedList<Object> list = new LinkedList<Object>();

    public Stuck(){

    }

    public void push(Object obj){
        list.addFirst(obj);
    }

    public Object pop(){
        Object obj = list.getLast();
        list.removeLast();
        return obj;
    }

    public Object pick(){
        Object obj = list.getLast();
        return obj;
    }
}
