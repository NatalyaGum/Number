package by.epam.task1.parser.impl;

import by.epam.task1.validator.impl.NumberValidatorImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import java.util.ArrayList;
import java.util.List;

public class StrToDblArrayParserImpl {
    static Logger logger = LogManager.getLogger();

    public double[] parseAllLines(List<String> lineFromFile) {
        NumberValidatorImpl validator = new NumberValidatorImpl();
        List<Double> listOfDouble = new ArrayList<Double>();

        if (!lineFromFile.isEmpty()) {
            for (String dblFromFile : lineFromFile) {
                if (validator.validateArray(dblFromFile)) {
                    Double temp = Double.parseDouble(dblFromFile);
                    listOfDouble.add(temp);

                } else {
                    logger.info("Validaion was failed for: " + dblFromFile);

                }
            }
        }
        Double[] arrayD = listOfDouble.toArray(Double[]::new);
        double[] dblArray = new double[arrayD.length];
        for (int i = 0; i < arrayD.length; i++) {
            dblArray[i] = arrayD[i];
        }

        return dblArray;


    }
}




