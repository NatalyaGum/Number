package by.epam.task1.array;


import by.epam.task1.exception.ArrayException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class Massiv {
    static Logger logger = LogManager.getLogger();

    private double array[];

    public Massiv(double[] array) {
        double[] copyArray = Arrays.copyOf(array, array.length);
        this.array = copyArray;

    }

    public double[] getArray() throws ArrayException {
        return array.clone();
    }

    public void setArray(double[] array) {
        double[] copyArray = array.clone();
        this.array = copyArray;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Massiv massiv = (Massiv) o;
        return Arrays.equals(array, massiv.array);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(array);
    }

    @Override
    public String toString() {
        return "Massiv: " +
                Arrays.toString(array);
    }
}

