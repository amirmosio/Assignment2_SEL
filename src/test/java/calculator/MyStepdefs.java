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
    private int addResult;
    private double sqrtResult;
    private String exceptionString;


    @Before
    public void before() {
        calculator = new Calculator();
    }

    @Given("^Add Two input values, -(\\d+) and (\\d+)$")
    public void twoInputValuesAndWithNegArg(int arg0, int arg1) {
        value1 = -1 * arg0;
        value2 = arg1;
    }

    @Given("^Add two input values, -(\\d+) and (\\d+)$")
    public void add_two_input_values_and(int arg1, int arg2) throws Throwable {
        value1 = -1 * arg1;
        value2 = arg2;
    }


    @Given("^Add two input values, (\\d+) and (\\d+)$")
    public void twoInputValuesAnd(int arg0, int arg1) {
        value1 = arg0;
        value2 = arg1;
    }


    @When("^I add the two values$")
    public void iAddTheTwoValues() {
        addResult = calculator.add(value1, value2);
        System.out.print(addResult);
    }

    @Then("^I expect the result (\\d+) from add$")
    public void iExpectTheResult(int arg0) {
        Assert.assertEquals(arg0, addResult);
    }

    /// sqrt
    @When("^I call func with two values$")
    public void iCallFuncWithTwoValues() {
        try {
            sqrtResult = calculator.sqrtOfAFraction(value1, value2);
            System.out.print(sqrtResult);
        } catch (Exception e) {
            exceptionString = e.getMessage();
        }

    }


    @Given("^SQRT two input values, (\\d+) and (\\d+)$")
    public void twoPositiveInputValuesAnd(int arg0, int arg1) {
        value1 = arg0;
        value2 = arg1;
    }

    @Given("^SQRT two input values, -(\\d+) and -(\\d+)$")
    public void twoNegativeInputValuesAnd(int arg0, int arg1) {
        value1 = -1 * arg0;
        value2 = -1 * arg1;
    }

    @Given("^SQRT two input values, (\\d+) and -(\\d+)$")
    public void twoPositiveNegativeInputValuesAnd(int arg0, int arg1) {
        value1 = arg0;
        value2 = -1 * arg1;
    }

    @Given("^SQRT two input values, -(\\d+) and (\\d+)$")
    public void twoNegativePositiveInputValuesAnd(int arg0, int arg1) {
        value1 = -1 * arg0;
        value2 = arg1;
    }


    @Then("^I expect the result infinity from sqrt$")
    public void iExpectTheResultInfinity() {
        Assert.assertEquals(sqrtResult, Double.POSITIVE_INFINITY, 0.0001);
    }


    @Then("^I expect the result \"([^\"]*)\" from sqrt$")
    public void iExpectTheResultFromSqrt(String arg0) throws Throwable {
        Assert.assertEquals(arg0, exceptionString);
    }

    @Then("^I expect the result sqrt of negative number from sqrt$")
    public void i_expect_the_result_sqrt_of_negative_number_from_sqrt() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals(exceptionString, "sqrt of negative number");
    }

    @Then("^I expect the result (\\d+)\\.(\\d+) from sqrt$")
    public void iExpectTheResultFromSqrt(int arg0, int arg1) {
        Assert.assertEquals(Double.parseDouble(arg0 + "." + arg1), sqrtResult, 0.00001);
    }


    @Then("^I expect the result (\\d+) from sqrt$")
    public void iExpectTheResultIntFromSqrt(double arg0) {
        Assert.assertEquals(arg0, sqrtResult, 0.00001);
    }


}

