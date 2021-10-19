package by.epam.task1.reader;

import by.epam.task1.exception.ArrayException;

import java.util.List;

public interface ReaderFromFile {
    List<String> readFile(String pathToFile) throws ArrayException;
}
