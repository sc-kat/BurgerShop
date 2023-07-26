package meal;

import javax.swing.*;

public class Drink {
    DrinkTypes type;
    Sizes size;
    Double price;

    public Drink(DrinkTypes type, Sizes size) {
        this.type = type;
        this.size = size;
        if(size == Sizes.SMALL) {
            this.price = 10.00;
        } else if (size == Sizes.MEDIUM) {
            this.price = 15.20;
        } else {
            this.price = 19.80;
        }
    }


}
