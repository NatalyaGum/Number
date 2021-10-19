package by.epam.task1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Chislo {
    private float num;
    static Logger logger = LogManager.getLogger();
    public Chislo(float num) {
        this.num = num;

    }

    public float getNum() {
        logger.info("Quotient of numbers in array: " + num);
        return num;

    }




}




