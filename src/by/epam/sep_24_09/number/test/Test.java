package by.epam.sep_24_09.number.test;

import by.epam.sep_24_09.number.Chislo;
import by.epam.sep_24_09.number.fabric.FabricOfChislo;
import by.epam.sep_24_09.number.math.Addition;
import by.epam.sep_24_09.number.math.Division;
import by.epam.sep_24_09.number.num_reader.NumReader;
import java.io.IOException;
import static by.epam.sep_24_09.number.math.Multiplication.multiply;


public class Test {
    public static void main(String[] args) throws IOException {
        float value;

        //FabricOfChislo
        Chislo a = (FabricOfChislo.initChislo());
        value = a.getNum();
        System.out.println("Object from FabricOfChislo: " + a);


        //NumReader
        float[] arr = NumReader.readTwoNum();

        arr = NumReader.readAllNum("file.txt");

        //Addition
        value = Addition.add();

        value = Addition.add("file.txt");

        value = Addition.add(arr);


        Chislo n1 = new Chislo(2.5f);
        Chislo n2 = new Chislo(3.5f);
        value = Addition.add(n1, n2);

        //Division
        value = Division.divide(arr);

        //Multiplication
        value=multiply();


    }
}
