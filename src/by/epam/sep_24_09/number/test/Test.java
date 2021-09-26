package by.epam.sep_24_09.number.test;

import by.epam.sep_24_09.number.Chislo;
import by.epam.sep_24_09.number.fabric.FabricOfChislo;
import by.epam.sep_24_09.number.math.Addition;
import by.epam.sep_24_09.number.math.Division;
import by.epam.sep_24_09.number.num_reader.NumReader;

import java.io.IOException;
import java.util.Arrays;


public class Test {
    public static void main(String[] args) throws IOException {
        float value;

        //FabricOfChislo
        Chislo a = (FabricOfChislo.initChislo());
        value = a.getNum();
        System.out.println("Object from FabricOfChislo: " + a);
        System.out.println("Number from FabricOfChislo: " + value);

        //NumReader
        float[] arr = NumReader.readTwoNum();
        System.out.println(arr[0]);
        System.out.println(arr[1]);

        arr = NumReader.readAllNum("file.txt");
        System.out.println(Arrays.toString(arr));


        //Addition
        value = Addition.add();
        System.out.println("Summa iz faila 2 chisla:  " + value);

        value = Addition.add("file.txt");
        System.out.println("Summa iz faila:   " + value);

        value = Addition.add(arr);
        System.out.println("Summa of numbers in array: " + value);

        Chislo n1 = new Chislo(2.5f);
        Chislo n2 = new Chislo(3.5f);
        value = Addition.add(n1, n2);
        System.out.println("Summa of objects Chislo " + value);

        value = Addition.add(arr);
        System.out.println("Summa of numbers in array: " + value);

        //Division
        value = Division.divide(arr);
        System.out.println("Quotient of numbers in array: " + value);

    }
}
