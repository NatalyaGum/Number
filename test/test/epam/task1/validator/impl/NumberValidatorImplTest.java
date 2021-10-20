package by.epam.task1.validator.impl;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NumberValidatorImplTest {
    NumberValidatorImpl validator = new NumberValidatorImpl();

    @DataProvider(name = "testValidation")
    public Object[][] createData() {
        return new Object[][]{
                {"-1", true},
                {"1,8", false},
                {"k.lk", false},
                {"2.2", true}};
    }

    @Test(dataProvider = "testValidation")
    public void testValidateArray(String line, boolean expected) {
        boolean actual = validator.validateArray(line);
        Assert.assertEquals(actual, expected);

    }
}