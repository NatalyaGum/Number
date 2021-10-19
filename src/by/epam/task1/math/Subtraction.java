package by.epam.task1.math;

import by.epam.task1.Chislo;
import by.epam.task1.num_reader.NumReader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;

public class Subtraction {

    static Logger logger = LogManager.getLogger();
    public static float subtract() throws IOException {
        float[] arr = new float[2];
        arr = NumReader.readTwoNum();
        float result = (arr[0] - arr[1]);
        logger.info("Result of numbers in array: " + result);
        return result;
    }

    public static float subtract(float[] arr) throws IOException {
        logger.info("Result of numbers in array: "+ (arr[0] / arr[1]));
        return (arr[0] - arr[1]);
    }

    public static float subtract(Chislo n1, Chislo n2) throws IOException {
        float result = (n1.getNum() - n2.getNum());
        logger.info("Result of numbers in array: "+ result);
        return result;
    }}


