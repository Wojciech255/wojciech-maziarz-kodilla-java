package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }
    @Test
    void testAddFigure() {
        //Given

        ShapeCollector figures = new ShapeCollector(new ArrayList<Shape>(Arrays.asList(
                new Circle(20),
                new Square(20))));
        ShapeCollector addFigure = new ShapeCollector(new ArrayList<Shape>(Arrays.asList(
                new Circle(20),
                new Square(20),
                new Triangle(15,20))));
        int addFigureSize = addFigure.getFigures().size();
        //When

        figures.addFigure(new Triangle(15,20));
        int newList = figures.getFigures().size();
        //Then

        Assertions.assertEquals(newList,newList);
    }
    @Test
    void testRemoveFigure() {
        //Given
        Circle circle = new Circle(20);
        Square square = new Square(20);
        Triangle triangle = new Triangle(15,20);

        ShapeCollector figures = new ShapeCollector(new ArrayList<Shape>(Arrays.asList(circle,square,triangle)));

        ShapeCollector addFigure = new ShapeCollector(new ArrayList<Shape>(Arrays.asList(circle,square)));

        int addFigureSize = addFigure.getFigures().size();
        //When
            figures.removeFigure(triangle);
            int newList = figures.getFigures().size();
        //Then
        Assertions.assertEquals(addFigureSize, newList);
    }
    @Test
    void getFigure() {
        //Given
        Circle circle = new Circle(20);
        Square square = new Square(20);
        Triangle triangle = new Triangle(15,20);

        ShapeCollector figures = new ShapeCollector(new ArrayList<Shape>(Arrays.asList(circle,square,triangle)));

        //When
        Shape shape1 = figures.getFigure(1);
        Shape shape2 = figures.getFigure(-1);
        Shape shape3 = figures.getFigure(3);
        //Then
        Assertions.assertEquals(square, shape1);
        Assertions.assertEquals(null, shape2);
        Assertions.assertEquals(null, shape3);
    }
    @Test
    void showFigures() {
        //Given
        Circle circle = new Circle(20);
        Square square = new Square(20);
        Triangle triangle = new Triangle(15,20);
        ArrayList<Shape> figures = new ArrayList<Shape>(Arrays.asList(circle,square,triangle));

        ShapeCollector collections = new ShapeCollector(figures);

        //When

        //Then
        Assertions.assertEquals(figures,collections.showFigures());
    }
}
