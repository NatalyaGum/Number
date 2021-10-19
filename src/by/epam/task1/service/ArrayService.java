package by.epam.task1.service;

import by.epam.task1.array.Massiv;
import by.epam.task1.exception.ArrayException;

public interface ArrayService {

    double findAverage(Massiv massiv) throws ArrayException;

    int countNegative(Massiv massiv) throws ArrayException;

    Massiv change(Massiv massiv, int index, double num) throws ArrayException;

    double findMax(Massiv massiv) throws ArrayException;

    double findMin(Massiv massiv) throws ArrayException;

    double findSumOfElem(Massiv massiv) throws ArrayException;

    int countNegativeStream(Massiv massiv) throws ArrayException;

    double findMaxStream(Massiv massiv) throws ArrayException;

    double findMinStream(Massiv massiv) throws ArrayException;

    double findAverageStream(Massiv massiv) throws ArrayException;

    double findSumStream(Massiv massiv) throws ArrayException;

    Massiv changeStream(Massiv massiv, int gage, double newValue) throws ArrayException;
}
