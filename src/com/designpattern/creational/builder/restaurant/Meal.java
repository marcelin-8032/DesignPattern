package com.designpattern.creational.builder.restaurant;

import java.util.ArrayList;
import java.util.List;

public class Meal {

    private List<MenuItem> mealItemList;

    public Meal() {
        mealItemList = new ArrayList<>();
    }

    public void addItem(MenuItem menuItem) {
        mealItemList.add(menuItem);
    }

    float getCost() {

        float addition = 0;

        for (MenuItem m : mealItemList) {
            addition = addition + m.price();
        }
        return addition;
    }


    public void showItem() {
        System.out.println("*************************************");
        for (MenuItem m : mealItemList) {
            System.out.println("Meal item: " + m.name());
            System.out.println("Package Type: " + m.packageType().packaging());
            System.out.println("Price: " + m.price());
            System.out.println("**********************************");

        }

    }


}
