package by.epam.task1.validator.impl;

import by.epam.task1.validator.NumberValidator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberValidatorImpl {


    public boolean validateArray(String dblFromFile) {

        Pattern pattern = Pattern.compile(NumberValidator.NUMBER_REGEX);
        Matcher matcher = pattern.matcher(dblFromFile);

        return matcher.matches();
    }
}
