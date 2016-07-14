package day4.Sort;

import java.util.Comparator;

/**
 * Created by admin on 7/14/2016.
 */
public class CompSort implements Comparator<Object> {

    @Override
    public int compare(Object o1, Object o2) {
        if (o1.toString().compareTo(o2.toString()) > 0) {
            return -1;
        }
        if (o1.toString().compareTo(o2.toString()) < 0) {
            return 1;
        }
        return 0;
    }
}
