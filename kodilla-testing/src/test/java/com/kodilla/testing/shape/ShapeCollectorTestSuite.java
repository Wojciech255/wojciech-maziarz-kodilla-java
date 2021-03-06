package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

import java.util.List;

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

        ShapeCollector figures = new ShapeCollector();
        Circle circle = new Circle(20);
        Square square = new Square(20);

        //When

        figures.addFigure(circle);
        figures.addFigure(square);

        //Then

        Assertions.assertEquals(2, figures.getFigures().size());
    }

    @Test
    void testRemoveFigure() {
        //Given

        ShapeCollector figures = new ShapeCollector();
        Circle circle = new Circle(20);
        Square square = new Square(20);
        Triangle triangle = new Triangle(15, 20);

        figures.addFigure(circle);
        figures.addFigure(square);
        figures.addFigure(triangle);

        //When
        figures.removeFigure(triangle);
        //Then
        Assertions.assertEquals(2, figures.getFigures().size());
    }

    @Test
    void getFigure() {
        //Given
        ShapeCollector figures = new ShapeCollector();

        Circle circle = new Circle(20);
        Square square = new Square(20);
        Triangle triangle = new Triangle(15, 20);

        figures.addFigure(circle);
        figures.addFigure(square);
        figures.addFigure(triangle);

        //When
        Shape shape1 = figures.getFigure(0);
        Shape shape2 = figures.getFigure(1);
        Shape shape3 = figures.getFigure(2);
        //Then
        Assertions.assertEquals(circle, shape1);
        Assertions.assertEquals(square, shape2);
        Assertions.assertEquals(triangle, shape3);
    }

    @Test
    void showFigures() {
        //Given
        ShapeCollector figures = new ShapeCollector();
        Circle circle = new Circle(20);
        Square square = new Square(20);
        Triangle triangle = new Triangle(15, 20);

        figures.addFigure(circle);
        figures.addFigure(square);
        figures.addFigure(triangle);
        List<Shape> result = figures.showFigures();

        //When
        List<Shape> result1 = figures.showFigures();
        figures.addFigure(circle);
        figures.addFigure(square);
        figures.addFigure(triangle);

        //Then
        Assertions.assertEquals(result, result1);
    }
}
