package calculator;

import org.junit.Assert;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class MyStepdefs {
    private Calculator calculator;
    private int value1;
    private int value2;
    private int result;
    private double doubleResult;


    @Before
    public void before() {
        calculator = new Calculator();
    }

    @Given("^Two input values, -(\\d+) and (\\d+)$")
    public void twoInputValuesAndWithNegArg(int arg0, int arg1) {
        value1 = -1 * arg0;
        value2 = arg1;
    }


    @Given("^Two input values, (\\d+) and (\\d+)$")
    public void twoInputValuesAnd(int arg0, int arg1) {
        value1 = arg0;
        value2 = arg1;
    }


    @When("^I add the two values$")
    public void iAddTheTwoValues() {
        result = calculator.add(value1, value2);
        System.out.print(result);
    }

    @Then("^I expect the result (\\d+)$")
    public void iExpectTheResult(int arg0) {
        Assert.assertEquals(arg0, result);
    }


    @Then("^I expect the result (\\d+)\\.(\\d+)$")
    public void iExpectTheResult(int arg0, int arg1) {
        double c = Double.parseDouble(arg0 + "." + arg1);
        Assert.assertEquals(c, doubleResult, 0.00001);
    }

    @When("^I call func with two values$")
    public void iCallFuncWithTwoValues() {
        doubleResult = calculator.sqrtOfAFraction(value1, value2);
        System.out.print(result);
    }


    @Given("^Two positive input values, (\\d+) and (\\d+)$")
    public void twoPositiveInputValuesAnd(int arg0, int arg1) {
        value1 = arg0;
        value2 = arg1;
    }

    @Given("^Two negative input values, -(\\d+) and -(\\d+)$")
    public void twoNegativeInputValuesAnd(int arg0, int arg1) {
        value1 = -1 * arg0;
        value2 = -1 * arg1;
    }

    @Given("^Two positive-negative input values, (\\d+) and -(\\d+)$")
    public void twoPositiveNegativeInputValuesAnd(int arg0, int arg1) {
        value1 = arg0;
        value2 = -1 * arg1;
    }

    @Given("^Two negative-positive input values, -(\\d+) and (\\d+)$")
    public void twoNegativePositiveInputValuesAnd(int arg0, int arg1) {
        value1 = -1 * arg0;
        value2 = arg1;
    }

    @Given("^Two negative-zero input values, -(\\d+) and (\\d+)$")
    public void twoNegativeZeroInputValuesAnd(int arg0, int arg1) {
        value1 = -1 * arg0;
        value2 = arg1;
    }

    @Given("^Two positive-zero input values, (\\d+) and (\\d+)$")
    public void twoPositiveZeroInputValuesAnd(int arg0, int arg1) {
        value1 = arg0;
        value2 = arg1;
    }

    @Given("^Two zero-zero input values, (\\d+) and (\\d+)$")
    public void twoZeroZeroInputValuesAnd(int arg0, int arg1) {
        value1 = arg0;
        value2 = arg1;
    }
}

