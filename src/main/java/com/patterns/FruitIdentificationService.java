package com.patterns;

import com.patterns.strategy.Fruit;

public class FruitIdentificationService {

    public Fruit identify(String color, String shape, String size) {

        if ("green".equals(color) && "cylindric".equals(shape) && "small".equals(size)) {
            return new Fruit("kiwi");
        }
        if ("red".equals(color) && "diamond".equals(shape)&& "small".equals(size)) {
            return new Fruit("strawberry");
        }
        if ("yellow".equals(color) && "cylindric".equals(shape)&& "small".equals(size)) {
            return new Fruit("lemon");
        }
        if ("yellow".equals(color) && "long".equals(shape)&& "medium".equals(size)) {
            return new Fruit("banana");
        }
        if ("yellow".equals(color) && "round".equals(shape)&& "big".equals(size)) {
            return new Fruit("melon");
        }
        if ("yellow".equals(color) && "round".equals(shape)&& "small".equals(size)) {
            return new Fruit("lemon");
        }

        return new Fruit("unknown");
    }
}