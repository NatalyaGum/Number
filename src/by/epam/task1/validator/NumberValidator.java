package by.epam.task1.validator;

public interface NumberValidator {
    public static final String NUMBER_REGEX = "(\\-|\\+)?\\d+(\\.\\d+)?";

    boolean validateArray(String dblFromFile);
}
