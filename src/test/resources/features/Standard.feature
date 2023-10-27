@Smoke
Feature: As a potential client i need to open a calculator and do math operations

@Plus
  Scenario: Plus operation
    When Seven Plus Eight
    Then Result is Fifteen

  @Minus
  Scenario: Minus operation
    When Eight Minus Two
    Then Result is Six

  @Multiply
  Scenario: Multiply operation
    When Multiply Nine by Three
    Then Result is Twentyseven

  @Divide
  Scenario: Multiply operation
    When Eight divided by Two
    Then Result is Four