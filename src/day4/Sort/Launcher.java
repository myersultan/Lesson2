package day4.Sort;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by admin on 7/14/2016.
 */
public class Launcher {
    public static void main(String[] args) {
        System.out.println("===========Testing Sort==========");

        ArrayList<Object> list = new ArrayList<>();
        list.add("qwer");
        list.add("asdf");
        list.add("zxcv");
        list.add("wert");
        list.add("sdfg");
        list.add("xcvb");
        list.add("erty");
        list.add("dfgh");
        list.add("cvbn");
        list.add("tryu");

        Collections.sort(list, new CompSort());

        System.out.println(list);
    }
}
