package by.epam.sep_24_09.number;

import java.io.IOException;

public class Slozhenie {
    private float n1;
    private float n2;

    public static float summa() throws IOException {
       float arr[] = new float[2] ;
       arr=NumReader.arrnum();
       float summa=(arr[0] + arr[1]);
        return summa;
    }

    public static float summa(float arr[]) throws IOException {
        /*float arr[] = new float[2] ;
        arr=NumReader.arrnum();*/
        return (arr[0] + arr[1]);
    }
    public Chislo slozhenie(Chislo n1, Chislo n2) throws IOException {
        return new Chislo(this.n1 + this.n2);
    }




}

