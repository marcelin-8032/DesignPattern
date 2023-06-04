package com.design.pattern.creational.builder.restaurant;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
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
        log.info("*************************************");
        for (MenuItem m : mealItemList) {
            log.info("Meal item: " + m.name());
            log.info("Package Type: " + m.packageType().packaging());
            log.info("Price: " + m.price());
            log.info("**********************************");

        }

    }


}
