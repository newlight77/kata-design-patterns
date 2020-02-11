package com.patterns.strategy.strategies;

import com.patterns.strategy.Fruit;
import com.patterns.strategy.FruitIdentificationStrategy;
import com.patterns.strategy.FruitIdentifier;

public class MelonIdentificationStrategy implements FruitIdentificationStrategy {

    public MelonIdentificationStrategy(FruitIdentifier fruitIdentifier) {
        fruitIdentifier.register(this);
    }

    public Fruit identify(String color, String shape, String size) {
        if ("yellow".equals(color) && "round".equals(shape)&& "big".equals(size)) {
            return new Fruit("melon");
        }
        return new Fruit("unknown");
    }
}
