package day3.cafe;

/**
 * Created by admin on 7/12/2016.
 */
public class Ingredients {

    private int price;
    private String ingr;
    private String name;

    public void addCoffeeBean(){
        this.ingr = " Coffee ";
        this.price += 5;
    }

    public int getPrice(){
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getIngr() {
        return ingr;
    }

    public void setIngr(String ingr) {
        this.ingr = ingr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addShugar(){
        this.ingr += " Shugar ";
        this.price += 1;
    }

    public void addWater(){
        this.ingr += " Water ";
        this.price += 1;
    }

    public void addMilk(){
        this.ingr += " Milk ";
        this.price += 1;
    }

    public void addFrothedMilk(){
        this.ingr += " Frothed Milk ";
        this.price += 2;
    }

    public void addHotChocolate(){
        this.ingr += " Hot Chocolate ";
        this.price += 3;
    }

    public void addBlackTea(){
        this.ingr = "Black Tea";
        this.price += 5;
    }

    public void addGreenTea(){
        this.ingr = "Green Tea";
        this.price += 5;
    }

    public void addTeaWithBergamot(){
        this.ingr = "Tea with Bergamot";
        this.price += 7;
    }


}
