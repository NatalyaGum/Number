package by.epam.sep_24_09.number.fabric;

import by.epam.sep_24_09.number.Chislo;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.Random;

public class FabricOfChislo {
    static Logger logger = LogManager.getLogger();
    public static Chislo initChislo() {
        Random rand = new Random();
        Random rand2 = new Random();
        Chislo chislo = new Chislo(rand.nextFloat() * 100);
        logger.info("Object from FabricOfChislo: " + chislo);
        return chislo; //return Object
    }
}


