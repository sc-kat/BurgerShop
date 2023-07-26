package meal;

import java.util.Arrays;

public class Burger extends Item {

    Item extra1;
    Item extra2;
    Item extra3;

    public Burger(String name, Double price) {
        super("Burger", name, price);
    }

    @Override
    public String getName() {
        return super.getName() + " BURGER";
    }

    @Override
    public Double getAdjustedPrice() {
        return getBasePrice() +
                ((extra1 == null) ? 0 : extra1.getBasePrice()) +
                ((extra2 == null) ? 0 : extra2.getBasePrice()) +
                ((extra3 == null) ? 0 : extra3.getBasePrice());

    }

    public double getExtraPrice(String toppingName) {
        return switch (toppingName.toUpperCase()) {
            case "CHEESE", "AVOCADO", "CHILI" -> 1.0;
            case "HAM", "SALAMI", "BACON" -> 1.5;
            default -> 0.0;
        };
    }

    public void addTopping(String extra1, String extra2, String extra3) {
        this.extra1 = new Item("TOPPING", extra1, getExtraPrice(extra1));
        this.extra2 = new Item("TOPPING", extra2, getExtraPrice(extra2));
        this.extra3 = new Item("TOPPING", extra3, getExtraPrice(extra3));
    }

    public void printItemizedList() {
        printItem("BASE BURGER", getBasePrice());
        if(extra1 != null) {
            extra1.printItem();
        }
        if(extra2 != null) {
            extra2.printItem();
        }
        if(extra3 != null) {
            extra3.printItem();
        }
    }

    @Override
    public void printItem() {
        printItemizedList();
        System.out.println("-".repeat(30));
        super.printItem();
    }
}
