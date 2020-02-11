package com.patterns.strategy.strategies;

import com.patterns.strategy.Fruit;
import com.patterns.strategy.FruitIdentificationStrategy;
import com.patterns.strategy.FruitIdentifier;

public class BananaIdentificationStrategy implements FruitIdentificationStrategy {

    public BananaIdentificationStrategy(FruitIdentifier fruitIdentifier) {
        fruitIdentifier.register(this);
    }

    public Fruit identify(String color, String shape, String size) {
        if ("yellow".equals(color) && "long".equals(shape)&& "medium".equals(size)) {
            return new Fruit("banana");
        }
        return new Fruit("unknown");
    }
}
