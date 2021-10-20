package by.epam.task1.parser.impl;

import by.epam.task1.exception.ArrayException;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class StrToDblArrayParserImplTest {


    StrToDblArrayParserImpl parser = new StrToDblArrayParserImpl();
    List<String> listOfDouble = Arrays.asList("-1.1", "2.2", "3.3", "3.  87", "hsfh");
    double[] expected = {-1.1, 2.2, 3.3};


    @Test
    public void testParseAllLines() throws ArrayException {
        double[] actual = parser.parseAllLines(listOfDouble);
        Assert.assertEquals(actual, expected);
    }

}