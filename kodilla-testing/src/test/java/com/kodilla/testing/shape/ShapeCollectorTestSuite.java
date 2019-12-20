package com.kodilla.testing.shape;

import com.kodilla.testing.shape.ShapeCollector;
import com.kodilla.testing.shape.Square;
import org.junit.*;

import java.util.ArrayList;


public class ShapeCollectorTestSuite {
    private static int testNo = 0;


    @BeforeClass
    public static void before(){
        System.out.println("Start of tests!");
    }

    @AfterClass
    public static void after(){
        System.out.println("End of tests!");
    }

    @Before
    public  void beforeEveryTest(){
        testNo++;
        System.out.println("Ready to test: " + testNo );
    }

    @Test
    public void testAddFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle("Circle","Area of a circle: π * r * r ");

        //Taken
        shapeCollector.addShape(circle);

        //Then
        Assert.assertEquals(circle, shapeCollector.getFigure(0));

    }

    @Test
    public void testRemoveFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Triangle triangle = new Triangle("Triangle", "Area of a triangle: 0.5 * a * h");
        shapeCollector.addShape(triangle);

        //When
        boolean result = shapeCollector.removeShape(triangle);

        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(null,shapeCollector.getFigure(0));


    }

    @Test
    public void testGetFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Square square = new Square("Square", "Area of a square: a * a");
        shapeCollector.addShape(square);

        //When
        Shape getFigure = shapeCollector.getFigure(0);

        //Then
        Assert.assertEquals(square,shapeCollector.getFigure(0) );

    }

    @Test
    public void testShowFigures(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Square square = new Square("Square", "Area of a square: a * a");
        Triangle triangle = new Triangle("Triangle", "Area of a triangle: 0.5 * a * h");
        Circle circle = new Circle("Circle","Area of a circle: π * r * r ");

        shapeCollector.addShape(square);
        shapeCollector.addShape(triangle);
        shapeCollector.addShape(circle);

        ArrayList<Shape> shapeLibrary = new ArrayList<Shape>();
        shapeLibrary.add(square);
        shapeLibrary.add(triangle);
        shapeLibrary.add(circle);

        //When
        ArrayList<Shape> shapesResult = shapeCollector.showFigures();

        //Then
        Assert.assertEquals(shapeLibrary,shapesResult);

    }
}
