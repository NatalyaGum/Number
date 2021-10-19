package by.epam.task1.main;

import by.epam.task1.array.Massiv;
import by.epam.task1.exception.ArrayException;
import by.epam.task1.reader.impl.ReaderFromFileImpl;
import by.epam.task1.parser.impl.StrToDblArrayParserImpl;
import by.epam.task1.service.impl.ArrayServiceImpl;
import by.epam.task1.sorting.Impl.ArraySortingImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.List;

public class Main {
    static Logger logger = LogManager.getLogger();

    public static void main(String[] args) throws ArrayException {


        ReaderFromFileImpl reader = new ReaderFromFileImpl();
        StrToDblArrayParserImpl parser = new StrToDblArrayParserImpl();
        ArrayServiceImpl service = new ArrayServiceImpl();
        ArraySortingImpl sorter = new ArraySortingImpl();

        try {
            List<String> listOfDouble = reader.readFile("resources/file.txt");
            double[] lineFromFile = parser.parseAllLines(listOfDouble);

            logger.info("Array from file: " + Arrays.toString(lineFromFile));


            Massiv massiv = new Massiv(lineFromFile);
            double[] dblArray = massiv.getArray();
            logger.info("Array from file: " + Arrays.toString(dblArray));

            double num = service.findMax(massiv);
            logger.info("MaxNumber: " + num);

            num = service.findMin(massiv);
            logger.info("MinNumber: " + num);

            num = service.findAverage(massiv);
            logger.info("Average number of elements: " + num);

            service.change(massiv, 2, 2222214);
            //dblArray = massiv.getArray();
            logger.info("Array from file: " + massiv.toString());

            sorter.selectionSortFromSmall(massiv);
            sorter.bubbleSortFromBig(massiv);
            sorter.shellSort(massiv);


        } catch (ArrayException e) {
            logger.error(e);
            e.printStackTrace();
        }


    }
}
