package by.epam.task1.reader.impl;

import by.epam.task1.exception.ArrayException;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class ReaderFromFileImplTest {

    ReaderFromFileImpl reader;
    String pathToFile = "test_resources/test.txt";
    String wrongPathToFile = "wrong/test.txt";
    List<String> expected = Arrays.asList("1.1", "2.2", "3.3", "3.  87", "hsfh");

    @BeforeMethod
    public void setUp() {
        reader = new ReaderFromFileImpl();
    }

    @Test
    public void testReadFile() throws ArrayException {
        List<String> actual = reader.readFile(pathToFile);
        Assert.assertEquals(actual, expected);
    }

    @Test(expectedExceptions = ArrayException.class, expectedExceptionsMessageRegExp = ".*the file was not found.*")
    public void testReadExceptionFileNotFound() throws ArrayException {
        reader.readFile(wrongPathToFile);
    }

}