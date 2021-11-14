package com.kodilla.testing.shape;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("TDD: Shape Test Suite")
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

    @Nested
    @DisplayName("Tests of basics for ShapeCollector")
    class TestShapeCollectorBasics {

        @Test
        void testAddFigure() {
            //Given
            ShapeCollector shapeCollector1 = new ShapeCollector();
            Shape triangle = new EquilateralTriangle("blackTriangle", 5.5);
            //When
            boolean result = shapeCollector1.addFigure(triangle);
            //Then
            assertTrue(result);
        }

        @Test
        void testRemoveFigure() {
            //Given
            ShapeCollector shapeCollector2 = new ShapeCollector();
            Shape square = new Square("redSquare", 6);
            shapeCollector2.addFigure(square);
            //When
            boolean result = shapeCollector2.removeFigure(square);
            //Then
            assertTrue(result);
        }
    }

    @Nested
    @DisplayName("Tests of advanced methods for ShapeCollector")
    class TestShapeCollectorAdvanced {
        @Test
        void  testGetFigure(){
            //Given
            ShapeCollector shapeCollector3 = new ShapeCollector();
            Shape square = new Square("redSquare", 4);
            Shape circle = new Circle("bigCircle", 2);
            shapeCollector3.addFigure(square);
            shapeCollector3.addFigure(circle);
            //When
            Shape retrievedShape;
            retrievedShape = shapeCollector3.getFigure(1);
            //Then
            assertEquals(circle, retrievedShape);
        }

        @Test
        void  testShowFigures(){
            //Given
            ShapeCollector shapeCollector4 = new ShapeCollector();
            Shape square = new Square("redSquare", 2);
            Shape circle = new Circle("bigCircle", 1);
            shapeCollector4.addFigure(square);
            shapeCollector4.addFigure(circle);
            //When
            String retrievedShowFigures = "Square: redSquare, field: 4; Circle: bigCircle, field: 3.14";
            String result = shapeCollector4.showFigures();
            //Then
            assertEquals(retrievedShowFigures, result);
        }
    }
}
