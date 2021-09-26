package by.epam.sep_24_09.number.math;

import by.epam.sep_24_09.number.Chislo;
import by.epam.sep_24_09.number.num_reader.NumReader;

import java.io.IOException;

public class Addition {

    public static float add(String args) throws IOException {
        float[] arr = new float[]{};
        arr = NumReader.readAllNum(args);
        float summa = 0;
        for (int i = 0; i < arr.length; i++) {
            summa += arr[i];
        }
        return summa;
    }

    public static float add() throws IOException {
        float[] arr = new float[2];
        arr = NumReader.readTwoNum();
        float summa = (arr[0] + arr[1]);
        return summa;
    }

    public static float add(float[] arr) throws IOException {
        /*float arr[] = new float[2] ;
        arr=NumReader.arrnum();*/
        return (arr[0] + arr[1]);
    }

    public static float add(Chislo n1, Chislo n2) throws IOException {
        float summa = (n1.getNum() + n2.getNum());
        return summa;
    }


}

