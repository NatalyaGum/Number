package by.epam.task1.math;



import by.epam.task1.Chislo;
import by.epam.task1.num_reader.NumReader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.IOException;

public class Multiplication {
    static Logger logger = LogManager.getLogger();

    public static float multiply() throws IOException {
        float[] arr = new float[2];
        arr = NumReader.readTwoNum();
        float result = (arr[0] * arr[1]);
        logger.info("Result iz faila 2 chisla:  " + result);
        return result;
    }

    public static float multiply(float[] arr) throws IOException {
        logger.info("Result of 2 numbers in array:  " + (arr[0] + arr[1]));
        return (arr[0] * arr[1]);
    }

    public static float multiply(Chislo n1, Chislo n2) throws IOException {
        float result = (n1.getNum() * n2.getNum());
        logger.info("Summa of objects Chislo: " + result);
        return result;
    }


}



