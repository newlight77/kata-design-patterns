package com.patterns.strategy;

import com.patterns.strategy.strategies.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FruitIdentificationServiceTest {

    private FruitIdentifier fruitIdentifier = new FruitIdentifier();
    private FruitIdentificationService fruitIdentificationService;

    public FruitIdentificationServiceTest() {
        fruitIdentificationService = new FruitIdentificationService(fruitIdentifier);
        fruitIdentifier.register(new KiwiIdentificationStrategy(fruitIdentifier));
        fruitIdentifier.register(new BananaIdentificationStrategy(fruitIdentifier));
        fruitIdentifier.register(new LemonIdentificationStrategy(fruitIdentifier));
        fruitIdentifier.register(new MelonIdentificationStrategy(fruitIdentifier));
        fruitIdentifier.register(new StrawberryIdentificationStrategy(fruitIdentifier));
    }

    @Test
    public void should_find_kiwi_by_green_color() {
        // Arrange
        String color = "green";
        String shape = "cylindric";
        String size = "small";
        // Act
        Fruit fruit = fruitIdentificationService.identify(color, shape, size);
        // Assert
        Assertions.assertNotNull(fruit);
        Assertions.assertEquals("kiwi", fruit.getName());
    }

    @Test
    public void should_find_strawberry_by_red_color() {
        // Arrange
        String color = "red";
        String shape = "diamond";
        String size = "small";
        // Act
        Fruit fruit = fruitIdentificationService.identify(color, shape, size);
        // Assert
        Assertions.assertNotNull(fruit);
        Assertions.assertEquals("strawberry", fruit.getName());
    }

    @Test
    public void should_find_lemon_by_yellow_color() {
        // Arrange
        String color = "yellow";
        String shape = "round";
        String size = "small";
        // Act
        Fruit fruit = fruitIdentificationService.identify(color, shape, size);
        // Assert
        Assertions.assertNotNull(fruit);
        Assertions.assertEquals("lemon", fruit.getName());
    }

    @Test
    public void should_find_banana_by_yellow_color() {
        // Arrange
        String color = "yellow";
        String shape = "long";
        String size = "medium";
        // Act
        Fruit fruit = fruitIdentificationService.identify(color, shape, size);
        // Assert
        Assertions.assertNotNull(fruit);
        Assertions.assertEquals("banana", fruit.getName());
    }

    @Test
    public void should_find_melon_when_having_yellow_color() {
        // Arrange
        String color = "yellow";
        String shape = "long";
        String size = "medium";
        // Act
        Fruit fruit = fruitIdentificationService.identify(color, shape, size);
        // Assert
        Assertions.assertNotNull(fruit);
        Assertions.assertEquals("banana", fruit.getName());
    }
}
