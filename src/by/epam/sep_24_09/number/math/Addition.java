package by.epam.sep_24_09.number.math;

import by.epam.sep_24_09.number.Chislo;
import by.epam.sep_24_09.number.num_reader.NumReader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;

public class Addition {
    static Logger logger = LogManager.getLogger();
    public static float add(String args) throws IOException {
        float[] arr = new float[]{};
        arr = NumReader.readAllNum(args);
        float summa = 0;
        for (int i = 0; i < arr.length; i++) {
            summa += arr[i];
        }
        logger.info("Summa of numbers in array: " + summa);
        return summa;
    }

    public static float add() throws IOException {
        float[] arr = new float[2];
        arr = NumReader.readTwoNum();
        float summa = (arr[0] + arr[1]);
        logger.info("Summa iz faila 2 chisla:  " + summa);
        return summa;
    }

    public static float add(float[] arr) throws IOException {
        logger.info("Summa of 2 numbers in array:  " + (arr[0] + arr[1]));
        return (arr[0] + arr[1]);
    }

    public static float add(Chislo n1, Chislo n2) throws IOException {
        float summa = (n1.getNum() + n2.getNum());
        logger.info("Summa of objects Chislo: " + summa);
        return summa;
    }


}

