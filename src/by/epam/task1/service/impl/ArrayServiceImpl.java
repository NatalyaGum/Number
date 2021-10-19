package by.epam.task1.service.impl;

import by.epam.task1.array.Massiv;
import by.epam.task1.exception.ArrayException;
import by.epam.task1.service.ArrayService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.stream.DoubleStream;

public class ArrayServiceImpl implements ArrayService {
    static Logger logger = LogManager.getLogger();

    @Override
    public double findMax(Massiv massiv) throws ArrayException {

        double[] dblArray = massiv.getArray();
        double max = dblArray[0];
        if (dblArray.length < 2) {
            logger.error("There is too small " + massiv);
            throw new ArrayException("There is too small " + massiv);
        }
        for (double i : dblArray) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    @Override
    public double findMin(Massiv massiv) throws ArrayException {
        double[] dblArray = massiv.getArray();
        double min = dblArray[0];
        if (dblArray.length < 2) {
            logger.error("There is too small " + massiv);
            throw new ArrayException("There is too small " + massiv);
        }
        for (double i : dblArray) {
            if (i < min) {
                min = i;
            }

        }
        return min;
    }

    @Override
    public double findAverage(Massiv massiv) throws ArrayException {
        double[] dblArray = massiv.getArray();
        double average, sum = 0;

        for (double i : dblArray) {
            sum += i;
        }
        average = sum / dblArray.length;
        return average;
    }

    @Override
    public double findSumOfElem(Massiv massiv) throws ArrayException {
        double[] dblArray = massiv.getArray();
        double sum = 0;
        for (double i : dblArray) {
            sum += i;
        }
        return sum;
    }

    @Override
    public int countNegative(Massiv massiv) throws ArrayException {
        double[] dblArray = massiv.getArray();
        int negative = 0;

        for (double i : dblArray) {
            if (i < 0) {
                negative++;
            }

        }
        return negative;
    }

    @Override
    public Massiv change(Massiv massiv, int index, double num) throws ArrayException {
        double[] dblArray = massiv.getArray();
        if (dblArray.length <= index) {
            logger.error("Out of index " + index);
            throw new ArrayException("Out of index " + index);
        }
        dblArray[index] = num;
        massiv.setArray(dblArray);
        logger.info("Change service" + Arrays.toString(dblArray));
        return massiv;
    }

    //DoubleStream


    @Override
    public int countNegativeStream(Massiv massiv) throws ArrayException {
        int negative = (int) DoubleStream
                .of(massiv.getArray())
                .filter(x -> x < 0)
                .count();
        return negative;
    }

    @Override
    public double findMaxStream(Massiv massiv) throws ArrayException {
        double[] dblArray = massiv.getArray();
        if (dblArray.length < 2) {
            logger.error("There is too small " + massiv);
            throw new ArrayException("There is too small " + massiv);
        }
        double max = DoubleStream.of(dblArray)
                .max()
                .getAsDouble();
        return max;
    }

    @Override
    public double findMinStream(Massiv massiv) throws ArrayException {
        double[] dblArray = massiv.getArray();
        if (dblArray.length < 2) {
            logger.error("There is too small " + massiv);
            throw new ArrayException("There is too small " + massiv);
        }
        double min = DoubleStream.of(dblArray)
                .min()
                .getAsDouble();
        return min;
    }

    @Override
    public double findAverageStream(Massiv massiv) throws ArrayException {
        double average = DoubleStream.of(massiv.getArray())
                .average()
                .getAsDouble();
        return average;
    }

    @Override
    public double findSumStream(Massiv massiv) throws ArrayException {
        double sum = DoubleStream.of(massiv
                .getArray())
                .sum();
        return sum;
    }

    @Override
    public Massiv changeStream(Massiv massiv, int gage, double newValue) throws ArrayException {
        double[] dblArray = DoubleStream.of(massiv.getArray())
                .map(x -> (x > gage) ? x = newValue : x)
                .toArray();
        massiv.setArray(dblArray);
        return massiv;
    }
}
