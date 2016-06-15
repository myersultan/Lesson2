package day1;

/**
 * Created by admin on 6/15/2016.
 */
public class BT7 extends Tank {

    public BT7(){
        setName("BT7");
        setColor("black");
        setCrew(5);
        setMaxSpeed(100);
    }

    @Override
    public String toString() {
        return "This is a tank " + this.getName();
    }
}
