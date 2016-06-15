package day1;

/**
 * Created by admin on 6/14/2016.
 */
public class Tank {

        private String name;
        private String color;
        private int crew;
        private int maxSpeed;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public int getCrew() {
            return crew;
        }

        public void setCrew(int crew) {
            this.crew = crew;
        }

        public int getMaxSpeed() {
            return maxSpeed;
        }

        public void setMaxSpeed(int maxSpeed) {
            if(maxSpeed > 200){
                this.maxSpeed = 200;
            }
            else{
                this.maxSpeed = maxSpeed;
            }
        }

        public Tank(){
            this("red", 4, 400);
            System.out.println("Tank()");
        }

        public Tank(String color){
            this(color, 0, 0);
            System.out.println("Tank(String)");

        }

        public Tank(String color, int crew, int maxSpeed){

            this.color = color;
            this.crew = crew;
            setMaxSpeed(maxSpeed);

            System.out.println("Tank(String, int, int)");

        }

        public void printInfo(){
            System.out.println(this.getName() + " color: " + this.getColor() + ", crew: " + this.getCrew() + ", maxSpeed: " + this.getMaxSpeed());
        }

    @Override
    public String toString() {
        return "This is a tank " + this.getName();
    }

    public void move(){
        System.out.println(this.getName() + " move!");
    }

    }
