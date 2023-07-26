package meal;

import meal.enums.Sizes;

import java.util.Objects;

public class Item {

    private String type;
    private String name;
    private Double price;
    private Sizes size = Sizes.MEDIUM;

    public Item(String type, String name, Double price) {
        this.type = type;
        this.name = name;
        this.price = price;
    }

    public String getName() {
        if(type.equals("DRINK".toLowerCase()) || type.equals("SIDE".toLowerCase())) {
            return size + " " + name.toUpperCase();
        }
        return name.toUpperCase();
    }

    public Double getBasePrice() {
        return price;
    }

    public Double getAdjustedPrice() {
        return switch (size) {
            case SMALL -> getBasePrice() - 0.5;
            case LARGE -> getBasePrice() + 1.00;
            default -> getBasePrice();
        };
    }

    public void setSize(Sizes size) {
        this.size = size;
    }

    public static void printItem(String name, double price) {
        System.out.printf("%20s:%6.2f%n", name, price);
    }

    public void printItem() {
        printItem(getName(), getAdjustedPrice());
    }
}
