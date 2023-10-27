package com.crowdar.examples.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.examples.services.CalculatorService;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CalculatorSteps extends PageSteps {

    @When("Seven Plus Eight")
    public void plus() {
    	CalculatorService.plus();
    }
    
    @Then("Result is Fifteen")
    public void result() {
    	CalculatorService.result();
    }

    @When("Eight Minus Two")
    public void nineMinusSeven() {
        CalculatorService.minus();
    }
    @Then("Result is Six")
    public void resultIsSix() {
        CalculatorService.resultMinus();
    }
    @When("Multiply Nine by Three")
    public void multiplyNineByThree() {
        CalculatorService.multiply();
    }
    @Then("Result is Twentyseven")
    public void resultIsTwentyseven() {
        CalculatorService.resultMultiply();
    }
    @When("Eight divided by Two")
    public void eightDividedByTwo() {
        CalculatorService.divide();
    }
    @Then("Result is Four")
    public void resultIsFour() {
        CalculatorService.resultDivide();
    }


}