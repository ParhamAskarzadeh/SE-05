package calculator;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.junit.Before;

import java.text.DecimalFormat;

public class MyStepdefs {
    private static final DecimalFormat decfor = new DecimalFormat("0.00");
    private Calculator calculator;
    private int value1;
    private int value2;
    private double result;
    private boolean error = false;

    @Before
    public void before() {
        calculator = new Calculator();
    }

    @Given("^Two input values, ([-+]?[0-9]*\\.?[0-9]+) and ([-+]?[0-9]*\\.?[0-9]+)$")
    public void twoInputValuesAnd(int arg0, int arg1) {
        value1 = arg0;
        value2 = arg1;
    }

    @When("^I calculate two values$")
    public void calculateTwoValues() {
        calculator = new Calculator();
        try {
            result = calculator.radical(value1, value2);
        } catch (Exception e) {
            error = true;
        }

        System.out.print(result);
    }

    @Then("^I expect the result ([-+]?[0-9]*\\.?[0-9]+|\\w+)$")
    public void iExpectTheResult(String expectedValue) {
        if (error || expectedValue.equals("error")) {
            error = false;
            Assert.assertEquals(expectedValue, "error");
        } else {

            String tempExpectedValue = decfor.format(Double.parseDouble(expectedValue));
            String tempExpectedResult = decfor.format(result);
            Assert.assertEquals(tempExpectedValue, tempExpectedResult);

        }

    }


}
