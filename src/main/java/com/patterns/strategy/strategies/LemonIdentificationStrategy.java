package com.patterns.strategy.strategies;

import com.patterns.strategy.Fruit;
import com.patterns.strategy.FruitIdentificationStrategy;
import com.patterns.strategy.FruitIdentifier;

public class LemonIdentificationStrategy implements FruitIdentificationStrategy {

    public LemonIdentificationStrategy(FruitIdentifier fruitIdentifier) {
        fruitIdentifier.register(this);
    }

    public Fruit identify(String color, String shape, String size) {
        if ("yellow".equals(color) && "round".equals(shape)&& "small".equals(size)) {
            return new Fruit("lemon");
        }
        return new Fruit("unknown");
    }
}
