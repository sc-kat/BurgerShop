import meal.*;
import meal.enums.Sizes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Item coke = new Item("drink", "coca-cola", 1.50);
//        coke.printItem();
//        coke.setSize(Sizes.LARGE);
//        coke.printItem();
//
//        Item cheese = new Item("Topping", "cheese", 1.00);
//        cheese.printItem();

//        Burger burger = new Burger("regular", 4.00);
//        burger.printItem();
//        burger.addTopping("Cheese", "avocado", "bacon");
//        burger.printItem();
//        System.out.println(burger.getAdjustedPrice());
//        burger.printItem();

        MealOrder mealOrder = new MealOrder();
        System.out.println(mealOrder.getTotalPrice());
        mealOrder.addBurgerToppings("CHEESE", "CHILI", "YOGHURT");
        mealOrder.setDrinkSize(Sizes.SMALL);
        mealOrder.printItemizedList();

//        MealOrder deluxeOrder = new MealOrder("deluxe", "fanta", "fries");
//        deluxeOrder.addBurgerToppings("CHEESE", "AVOCADO", "CHILI", "MAYO", "FISH");
//        deluxeOrder.setDrinkSize(Sizes.LARGE);
//        deluxeOrder.printItemizedList();

    }
}