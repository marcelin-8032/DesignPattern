package com.design.pattern.behavioral.visitor.shopping;

interface ShoppingCartVisitor {

    int visit(Book book);

    int visit(Fruit fruit);
}