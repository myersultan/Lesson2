package day3.cafe;

/**
 * Created by admin on 7/12/2016.
 */
public class Menu {

    Ingredients[] menu = {new BlackCoffee(), new Americano(), new CoffeeWithMilk(), new Cappuccino(), new Mocachino(),
    new BlackTea(), new GreenTea(), new TeaWithBergamot()};

    public Menu(){
        System.out.println("======================================Menu=========================================");
        System.out.println("|       Name        |" + "|                 Ingredients                 |"
                + "|        Price       |");
        System.out.println("-----------------------------------------------------------------------------------");

        int i = 1;
        for (Ingredients m : menu){
            System.out.print(i + ") | " + m.getName() + "      |");
            System.out.print("    " + m.getIngr() + "    |");
            System.out.println("   $" + m.getPrice() + "    |");

            i++;
        }
    }
}
