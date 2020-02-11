package com.patterns.strategy;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class FruitIdentifier {
    private Map<Class, FruitIdentificationStrategy> strategies = new HashMap<>();
    public Optional<Fruit> identify(String color, String shape, String size) {
        return strategies.values()
                .stream()
                .map(strategy -> strategy.identify(color, shape, size))
                .filter(fruit -> !"unknown".equals(fruit.getName()))
                .findFirst();
    }

    public void register(FruitIdentificationStrategy strategy) {
        this.strategies.put(strategy.getClass(), strategy);
    }
}