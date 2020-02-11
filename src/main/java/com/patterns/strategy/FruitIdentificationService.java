package com.patterns.strategy;

import com.patterns.strategy.Fruit;
import com.patterns.strategy.FruitIdentifier;

public class FruitIdentificationService {

    private FruitIdentifier identifier;

    public FruitIdentificationService(FruitIdentifier identifier) {
        this.identifier = identifier;
    }

    public Fruit identify(String color, String shape, String size) {
        return identifier.identify(color, shape, size).get();
    }

}