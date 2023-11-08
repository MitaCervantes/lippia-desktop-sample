package com.crowdar.examples.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.examples.services.CalculatorService;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CalculatorSteps extends PageSteps {

    @When("ingreso un numero {string}")
    public void ingresoUnValor(String numero)  throws InterruptedException  {
        CalculatorService.inputNumeros(numero);
    }

    @When("Seven Plus Eight")
    public void plus() {
    	CalculatorService.plus();
    }
    @And("clic en la el boton de sumar")
    public void clicEnLaElBotonDeSumar() { CalculatorService.plus();
    }
    @And("clic en la el boton de restar")
    public void clicEnLaElBotonDeRestar() { CalculatorService.minus();
    }
    @And("clic en la el boton de multiplicar")
    public void clicEnLaElBotonDeMultiplicar() { CalculatorService.multiply();
    }
    @And("clic en la el boton de dividir")
    public void clicEnLaElBotonDeDividir() { CalculatorService.divide();
    }
    @Then("el resultado es {string}")
    public void elResultadoEs(String resultado) {
        CalculatorService.verifyResult(resultado);
    }

}