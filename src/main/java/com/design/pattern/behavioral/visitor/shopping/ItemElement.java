package com.design.pattern.behavioral.visitor.shopping;

interface ItemElement {
    int accept(ShoppingCartVisitor visitor);
}



