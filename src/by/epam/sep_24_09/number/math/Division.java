package by.epam.sep_24_09.number.math;
import by.epam.sep_24_09.number.Chislo;
import by.epam.sep_24_09.number.num_reader.NumReader;

import java.io.IOException;

public class Division {


    public static float divide() throws IOException {
        float[] arr = new float[2];
        arr = NumReader.readTwoNum();
        float summa = (arr[0] / arr[1]);
        return summa;
    }

    public static float divide(float[] arr) throws IOException {
           return (arr[0] / arr[1]);
    }

    public static float divide(Chislo n1, Chislo n2) throws IOException {
        float summa = (n1.getNum() / n2.getNum());
        return summa;
    }}

