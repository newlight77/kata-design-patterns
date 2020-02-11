package com.patterns;

import com.patterns.strategy.Fruit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FruitIdentificationServiceTest {

    private FruitIdentificationService fruitIdentificationService;

    public FruitIdentificationServiceTest() {
        fruitIdentificationService = new FruitIdentificationService();
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


}
