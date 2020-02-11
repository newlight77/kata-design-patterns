package com.patterns.strategy.strategies;

import com.patterns.strategy.Fruit;
import com.patterns.strategy.FruitIdentificationStrategy;
import com.patterns.strategy.FruitIdentifier;

public class StrawberryIdentificationStrategy implements FruitIdentificationStrategy {

    public StrawberryIdentificationStrategy(FruitIdentifier fruitIdentifier) {
        fruitIdentifier.register(this);
    }

    public Fruit identify(String color, String shape, String size) {
        if ("red".equals(color) && "diamond".equals(shape)&& "small".equals(size)) {
            return new Fruit("strawberry");
        }
        return new Fruit("unknown");
    }
}
