package com.patterns.strategy;

public interface FruitIdentificationStrategy {
    Fruit identify(String color, String shape, String size);
}
