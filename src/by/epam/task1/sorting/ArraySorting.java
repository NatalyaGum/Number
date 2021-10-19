package by.epam.task1.sorting;

import by.epam.task1.array.Massiv;
import by.epam.task1.exception.ArrayException;

public interface ArraySorting {

    double[] bubbleSortFromBig(Massiv massiv) throws ArrayException;

    double[] shellSort(Massiv massiv) throws ArrayException;

    double[] selectionSortFromSmall(Massiv massiv) throws ArrayException;

    double[] sortStream(Massiv massiv) throws ArrayException;


}
