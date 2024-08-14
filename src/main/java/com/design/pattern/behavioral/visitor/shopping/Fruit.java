package com.design.pattern.behavioral.visitor.shopping;


import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
class Fruit implements ItemElement {

    private int pricePerKg;

    private int weight;

    private String name;

    @Override
    public int accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }
}