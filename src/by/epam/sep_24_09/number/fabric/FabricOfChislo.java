package by.epam.sep_24_09.number.fabric;

import by.epam.sep_24_09.number.Chislo;

import java.util.Random;

public class FabricOfChislo {
    public static Chislo initChislo() {
        Random rand = new Random();
        Random rand2 = new Random();
        Chislo chislo = new Chislo(rand.nextFloat() * 100);
        return chislo; //return Object
    }
}


