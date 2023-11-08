@Smoke
Feature: As a potential client i need to open a calculator and do math operations

@Plus
  Scenario Outline: Plus operation
  When ingreso un numero '<num1>'
  And clic en la el boton de sumar
  And ingreso un numero '<num2>'
  Then el resultado es '<resultado>'

  Examples:
    | num1 | num2 | resultado |
    | 12   | 25   | 37        |
    | 123  | 42   | 165       |


@Minus
  Scenario Outline: Minus operation
    When ingreso un numero '<num1>'
    And clic en la el boton de restar
    And ingreso un numero '<num2>'
    Then el resultado es '<resultado>'

    Examples:
      | num1 | num2 | resultado |
      | 25   | 12   | 13        |
      | 123  | 42   | 81        |

@Multiply
  Scenario Outline: Multiply operation
    When ingreso un numero '<num1>'
    And clic en la el boton de multiplicar
    And ingreso un numero '<num2>'
    Then el resultado es '<resultado>'

    Examples:
      | num1 | num2 | resultado |
      | 25   | 12   | 300       |
      | 123  | 42   | 5166      |

@Divide
  Scenario Outline: Multiply operation
    When ingreso un numero '<num1>'
    And clic en la el boton de dividir
    And ingreso un numero '<num2>'
    Then el resultado es '<resultado>'

    Examples:
      | num1 | num2 | resultado |
      | 25   | 5    | 5         |
      | 180  | 9    | 20        |