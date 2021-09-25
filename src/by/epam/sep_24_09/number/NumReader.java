package by.epam.sep_24_09.number;

import java.io.*;

public class NumReader {

    public static float[] arrnum() throws IOException {

        // create file input stream
        InputStream is = new FileInputStream("file.txt");
        // create new data input stream
        DataInputStream dis = new DataInputStream(is);

        int i = 0;
        float arr[] = new float[2];
        while (i < 2 && (dis.available() > 0)) {
            arr[i] = dis.readFloat();
           // System.out.print(arr[i]);
            i++;
        }
        return arr;
    }
}