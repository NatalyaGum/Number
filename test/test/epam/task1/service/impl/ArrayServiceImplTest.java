package by.epam.task1.service.impl;

import by.epam.task1.array.Massiv;
import by.epam.task1.exception.ArrayException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ArrayServiceImplTest {


    double[] testArray = new double[]{-1.1, 2.2, 3.3};
    double[] testArray1 = new double[]{-2.2};
    Massiv massiv, massiv1;
    ArrayServiceImpl service;
    double expectedMax = 3.3;
    double expectedMin = -1.1;
    double expectedAverage = 1.466667;
    double expectedNegative = 1;
    double expectedSum = 4.4;
    double newValue = 999;
    int index = 1;
    int gage = 2;
    Massiv expectedChangedMassiv = new Massiv(new double[]{-1.1, 999.0, 3.3});
    Massiv expectedChangedMassivStream = new Massiv(new double[]{-1.1, 999.0, 999.0});

    @BeforeMethod
    public void initialize() {
        massiv = new Massiv(testArray);
        massiv1 = new Massiv(testArray1);
        service = new ArrayServiceImpl();
    }

    @Test
    public void testFindMax() throws ArrayException {
        double actual = service.findMax(massiv);
        assertEquals(actual, expectedMax);
    }

    @Test
    public void testFindMin() throws ArrayException {
        double actual = service.findMin(massiv);
        assertEquals(actual, expectedMin);
    }


    @Test
    public void testFindAverage() throws ArrayException {
        double actual = service.findAverage(massiv);
        assertEquals(actual, expectedAverage, 0.001);
    }

    @Test
    public void testFindSumOfElem() throws ArrayException {
        double actual = service.findSumOfElem(massiv);
        assertEquals(actual, expectedSum);

    }

    @Test
    public void testFindNegative() throws ArrayException {
        double actual = service.countNegative(massiv);
        assertEquals(actual, expectedNegative);
    }

    @Test
    public void testChange() throws ArrayException {
        Massiv actual = service.change(massiv, index, newValue);
        assertEquals(actual, expectedChangedMassiv);
    }

    @Test
    public void testCountNegativeStream() throws ArrayException {
        double actual = service.countNegativeStream(massiv);
        assertEquals(actual, expectedNegative);
    }

    @Test
    public void testFindMaxStream() throws ArrayException {
        double actual = service.findMaxStream(massiv);
        assertEquals(actual, expectedMax);

    }

    @Test
    public void testFindMinStream() throws ArrayException {
        double actual = service.findMinStream(massiv);
        assertEquals(actual, expectedMin);
    }

    @Test
    public void testFindAverageStream() throws ArrayException {
        double actual = service.findAverageStream(massiv);
        assertEquals(actual, expectedAverage, 0.001);
    }


    @Test
    public void testFindSumStream() throws ArrayException {
        double actual = service.findSumStream(massiv);
        assertEquals(actual, expectedSum);
    }

    @Test
    public void testChangeStream() throws ArrayException {
        Massiv actual = service.changeStream(massiv, index, newValue);
        assertEquals(actual, expectedChangedMassivStream);
    }

    @Test(expectedExceptions = ArrayException.class, expectedExceptionsMessageRegExp = ".*There is too small Massiv.*")
    public void testArrayException() throws ArrayException {
        service.findMax(massiv1);
    }
}