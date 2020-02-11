package com.patterns.strategy.strategies;

import com.patterns.strategy.Fruit;
import com.patterns.strategy.FruitIdentificationStrategy;
import com.patterns.strategy.FruitIdentifier;

public class KiwiIdentificationStrategy implements FruitIdentificationStrategy {

    public KiwiIdentificationStrategy(FruitIdentifier fruitIdentifier) {
        fruitIdentifier.register(this);
    }

    public Fruit identify(String color, String shape, String size) {
        if ("green".equals(color) && "cylindric".equals(shape)&& "small".equals(size)) {
            return new Fruit("kiwi");
        }
        return new Fruit("unknown");
    }
}
