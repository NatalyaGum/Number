package by.epam.task1.sorting.Impl;

import by.epam.task1.array.Massiv;
import by.epam.task1.exception.ArrayException;
import by.epam.task1.sorting.ArraySorting;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.stream.DoubleStream;

public class ArraySortingImpl implements ArraySorting {
    static Logger logger = LogManager.getLogger();


    @Override
    public double[] bubbleSortFromBig(Massiv massiv) throws ArrayException {
        double[] dblArray = massiv.getArray();
        int i, j;
        double tempInt;
        if (dblArray.length <= 2) {
            logger.error("There is too small " + massiv);
            throw new ArrayException("There is too small " + massiv);
        }
        for (i = 1; i < dblArray.length; i++) {
            for (j = dblArray.length - 1; j >= i; j--) {
                if (dblArray[j - 1] < dblArray[j]) {
                    tempInt = dblArray[j - 1];
                    dblArray[j - 1] = dblArray[j];
                    dblArray[j] = tempInt;
                }
            }
        }
        logger.info("bubbleSort: " + Arrays.toString(dblArray));
        return dblArray;
    }

    @Override
    public double[] shellSort(Massiv massiv) throws ArrayException {
        double[] dblArray = massiv.getArray();
        double temp = 0;
        int count = 0;
        if (dblArray.length <= 2) {
            logger.error("There is too small " + massiv);
            throw new ArrayException("There is too small " + massiv);
        }
        for (int gap = dblArray.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < dblArray.length; i++) {
                for (int j = i - gap; j >= 0; j -= gap) {
                    if (dblArray[j] > dblArray[j + gap]) {
                        temp = dblArray[j];
                        dblArray[j] = dblArray[j + gap];
                        dblArray[j + gap] = temp;
                    }
                }
            }
            ++count;
        }
        logger.info("shellSort: " + Arrays.toString(dblArray));
        return dblArray;
    }

    @Override
    public double[] selectionSortFromSmall(Massiv massiv) throws ArrayException {
        double[] dblArray = massiv.getArray();
        int i, j;
        if (dblArray.length <= 2) {
            logger.error("There is too small " + massiv);
            throw new ArrayException("There is too small " + massiv);
        }
        for (i = 0; i < dblArray.length; i++) {
            double min = dblArray[i];
            int min_i = i;

            for (j = i + 1; j < dblArray.length; j++) {
                if (dblArray[j] < min) {
                    min = dblArray[j];
                    min_i = j;
                }
            }

            if (i != min_i) {
                double tmp = dblArray[i];
                dblArray[i] = dblArray[min_i];
                dblArray[min_i] = tmp;
            }
        }
        logger.info("selectionSort: " + Arrays.toString(dblArray));
        return dblArray;
    }

    @Override
    public double[] sortStream(Massiv massiv) throws ArrayException {
        double[] dblArray = massiv.getArray();
        if (dblArray.length <= 2) {
            logger.error("There is too small " + massiv);
            throw new ArrayException("There is too small " + massiv);
        }
        double[] sortedArray = DoubleStream.of(dblArray)
                .sorted()
                .toArray();
        logger.info("sortStream: " + Arrays.toString(dblArray));
        return sortedArray;
    }

}
