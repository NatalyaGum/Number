package by.epam.sep_24_09.number.math;
import by.epam.sep_24_09.number.Chislo;
import by.epam.sep_24_09.number.num_reader.NumReader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;

public class Division {

    static Logger logger = LogManager.getLogger();
    public static float divide() throws IOException {
        float[] arr = new float[2];
        arr = NumReader.readTwoNum();
        float summa = (arr[0] / arr[1]);
        logger.info("Quotient of numbers in array: " + summa);
        return summa;
    }

    public static float divide(float[] arr) throws IOException {
        logger.info("Quotient of numbers in array: "+ (arr[0] / arr[1]));
           return (arr[0] / arr[1]);
    }

    public static float divide(Chislo n1, Chislo n2) throws IOException {
        float summa = (n1.getNum() / n2.getNum());
        logger.info("Quotient of numbers in array: "+ summa);
        return summa;
    }}

