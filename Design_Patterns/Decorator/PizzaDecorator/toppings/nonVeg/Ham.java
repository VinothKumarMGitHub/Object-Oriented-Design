package com.decorator.test.toppings.nonVeg;

import com.decorator.test.Pizza;
import com.decorator.test.PizzaDecorator;

/**
 * Created by Chaklader on 2/13/17.
 */
public class Ham extends PizzaDecorator{

    private final Pizza pizza;

    public Ham(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " , Ham (112.13)";
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + 112.13;
    }
}
