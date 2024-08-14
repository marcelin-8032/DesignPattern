package com.design.pattern.behavioral.visitor.shopping;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
class Book implements ItemElement {

    private int price;

    private String isbnNumber;

    @Override
    public int accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }
}