package day1;

/**
 * Created by admin on 6/14/2016.
 */
public class Launcher {

    public static void main(String[] args) {

        Tank t = new Tank();
        BT7 bt7 = new BT7();
        T34 t34 = new T34();
        Tiger tiger = new Tiger();

        bt7.printInfo();
        t34.printInfo();
        tiger.printInfo();



    }


}
