package com.crowdar.examples.services;

import org.testng.Assert;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.examples.constants.CalculatorConstants;

public class CalculatorService {

	private CalculatorService() {}

	public static void plus() {
    	ActionManager.click(CalculatorConstants.PLUS);
    }
    public static void minus() {
        ActionManager.click(CalculatorConstants.MINUS);
    }

    public static void multiply(){
        ActionManager.click(CalculatorConstants.MULTIPLY);
    }
    public static void divide(){
        ActionManager.click(CalculatorConstants.DIVIDE);
    }

    public static void inputNumeros(String numero) throws InterruptedException  {
        digitarNumeros(numero);
    }

    private static void digitarNumeros(String cifra) throws InterruptedException {
        String[] strArrayNums = cifra.split("");

        for (String digito : strArrayNums) {
                String xpath = String.format("XPATH://*[@AutomationId='num%sButton']", digito);
                ActionManager.click(xpath);
        }
    }

    public static String getResult() {
        ActionManager.click(CalculatorConstants.EQUAL);
		return ActionManager.getText(CalculatorConstants.CALCULATOR_RESULTS).replaceAll("\\D+", "").trim();
        //return ActionManager.getAttribute(CalculatorConstants.CALCULATOR_RESULTS, "Name");
    }

    public static void verifyResult(String resultado) {
        Assert.assertEquals(getResult(), resultado, "el resultado es incorrecto");
    }


}
