package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void testBasicPizzaOrderGetCost() {
        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        // When
        BigDecimal calculatedCost = theOrder.getCost();
        // Then
        assertEquals(new BigDecimal(15), calculatedCost);
    }

    @Test
    public void testBasicPizzaOrderGetDescription() {
        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        // When
        String description = theOrder.getDescription();
        // Then
        assertEquals("Dough and tomato sauce with cheese", description);
    }
    @Test
    public void testPepperoniPizzaDecoratorGetCost(){
        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new PepperoniPizzaDecorator(theOrder);
        // When
        BigDecimal theCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(35), theCost);
    }

    @Test
    public  void testPepperoniPizzaDecoratorGetDescription(){
        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new PepperoniPizzaDecorator(theOrder);
        // When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Dough and tomato sauce with cheese Pepperoni",description);
    }

    @Test
    public void testHawaiiPizzaDecoratorGetCost(){
        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new HawaiiPizzaDecorator(theOrder);
        // When
        BigDecimal theCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(30), theCost);
    }
    @Test
    public void testHawaiiPizzaDecoratorGetDescription(){
        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new HawaiiPizzaDecorator(theOrder);
        // When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Dough and tomato sauce with cheese Pineapple", description);

    }
}
