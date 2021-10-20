package by.epam.task1.sorting.Impl;

import by.epam.task1.array.Massiv;
import by.epam.task1.exception.ArrayException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ArraySortingImplTest {

    double[] testArray = new double[]{-2.2, 5.5, 3.3, 7.7, 1.1};
    double[] testArray1 = new double[]{-2.2};
    Massiv massiv, massiv1;
    ArraySortingImpl sorter;
    double[] expectedSortedArray = new double[]{7.7, 5.5, 3.3, 1.1, -2.2};
    double[] expectedSortedArrayFromSmall = new double[]{-2.2, 1.1, 3.3, 5.5, 7.7};

    @BeforeMethod
    public void initialize() {
        massiv = new Massiv(testArray);
        massiv1 = new Massiv(testArray1);
        sorter = new ArraySortingImpl();
    }

    @Test
    public void testBubbleSortFromBig() throws ArrayException {
        double[] actual = sorter.bubbleSortFromBig(massiv);
        assertEquals(actual, expectedSortedArray);
    }

    @Test
    public void testShellSort() throws ArrayException {
        double[] actual = sorter.shellSort(massiv);
        assertEquals(actual, expectedSortedArrayFromSmall);
    }

    @Test
    public void testSelectionSortFromSmall() throws ArrayException {
        double[] actual = sorter.selectionSortFromSmall(massiv);
        assertEquals(actual, expectedSortedArrayFromSmall);
    }

    @Test
    public void testSortStream() throws ArrayException {
        double[] actual = sorter.sortStream(massiv);
        assertEquals(actual, expectedSortedArrayFromSmall);
    }

    @Test(expectedExceptions = ArrayException.class, expectedExceptionsMessageRegExp = ".*There is too small Massiv.*")
    public void testArrayException() throws ArrayException {
        sorter.bubbleSortFromBig(massiv1);
    }


}