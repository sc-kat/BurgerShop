package meal;

import meal.enums.Sizes;

public class MealOrder {

    Burger burger;
    Item drink;
    Item side;

    public MealOrder() {
        this("regular", "coke", "fries");
    }
   public MealOrder(String burgertype, String drinktype, String sidetype) {
        if(burgertype.equalsIgnoreCase("deluxe")) {
            this.burger = new DeluxeBurger(burgertype, 9.0);
        } else{
            this.burger = new Burger(burgertype, 4.0);
        }
       this.drink = new Item("drink", drinktype, 1.5);
       this.side = new Item("side", sidetype, 0.5);
   }

   public double getTotalPrice() {
        return burger.getAdjustedPrice() + drink.getAdjustedPrice() + side.getAdjustedPrice();
   }

   public void printItemizedList() {
        burger.printItem();
        if(burger instanceof  DeluxeBurger) {
            Item.printItem(drink.getName(), 0.0);
            Item.printItem(side.getName(), 0.0);
        } else {
            drink.printItem();
            side.printItem();
        }
       System.out.println("-".repeat(30));
       Item.printItem("TOTAL PRICE", getTotalPrice());
   }

   public void addBurgerToppings(String extra1, String extra2, String extra3) {
        burger.addTopping(extra1, extra2, extra3);
   }
   public void addBurgerToppings(String extra1, String extra2, String extra3, String extra4, String extra5) {
        if(burger instanceof DeluxeBurger db) {
            db.addTopping(extra1, extra2, extra3,extra4, extra5);
        } else {
            burger.addTopping(extra1, extra2, extra3);
        }

   }

    public void setDrinkSize(Sizes size) {
        drink.setSize(size);
    }




}
