package by.epam.sep_24_09.number.num_reader;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;
import java.util.Arrays;

public class NumReader {
    static Logger logger = LogManager.getLogger();
    //read all file and make float array
    public static float[] readAllNum(String args) throws IOException {
        InputStream is = new FileInputStream(args);
        DataInputStream dis = new DataInputStream(is);
        DataInputStream dis2 = new DataInputStream(is);
        float[] arr = new float[100];
        int i = 0;
        while ((dis2.available() > 0)) {
            arr[i] = dis.readFloat();
            i++;
            }
        logger.info("All Array: " + Arrays.toString(arr));
        return arr;
    }

    //read file and make float array[2]
    public static float[] readTwoNum() throws IOException {

        InputStream is = new FileInputStream("file.txt");
        DataInputStream dis = new DataInputStream(is);

        int i = 0;
        float[] arr = new float[2];
        while (i < 2 && (dis.available() > 0)) {
            arr[i] = dis.readFloat();
            // System.out.print(arr[i]);
            i++;
        }
        logger.info("Array [2]: " + Arrays.toString(arr));
        return arr;


    }
}