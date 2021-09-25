package by.epam.sep_24_09.number;

import java.io.IOException;

public class  Test{
    public static void main(String args[]) throws IOException {
       //FabricOfChislo
        System.out.println((FabricOfChislo.initChislo()));
        float value;

        //NumReader
        float arr[]=NumReader.arrnum();
        System.out.println(arr[0]);
        System.out.println(arr[1]);

        //Slozhenie
       value = Slozhenie.summa();
       System.out.println ("Summa iz faila  " +value);

        value = Slozhenie.summa(arr);
        System.out.println ("Summa  " +value);

        Chislo n1= new Chislo(2/5);
        Chislo n2= new Chislo(3/5);
       // value = Slozhenie.summa(n1,n2);
        //System.out.println ("Summa " +value);
    }
}
