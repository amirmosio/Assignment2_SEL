@tag
Feature: Calculator

  Scenario: add two numbers
    Given Two input values, 1 and 2
    When I add the two values
    Then I expect the result 3

  Scenario Outline: add two numbers
    Given Two input values, <first> and <second>
    When I add the two values
    Then I expect the result <result>
    Examples:
      | first | second | result |
      | 1     | 12     | 13     |
      | -1    | 6      | 5      |
      | 2     | 2      | 4      |

  Scenario: sqrt of division of two positive number
    Given Two positive input values, 1 and 4
    When I call func with two values
    Then I expect the result 0.5

  Scenario: sqrt of division of two negative number
    Given Two negative input values, -1 and -4
    When I call func with two values
    Then I expect the result 0.5

  Scenario: sqrt of division of two positive-negative number
    Given Two positive-negative input values, 1 and -4
    When I call func with two values
    Then I expect the result 0

  Scenario: sqrt of division of two negative-positive number
    Given Two negative-positive input values, -1 and 4
    When I call func with two values
    Then I expect the result 0

  Scenario: sqrt of division of two negative-zero number
    Given Two negative-zero input values, -1 and 0
    When I call func with two values
    Then I expect the result 0

  Scenario: sqrt of division of two positive-zero number
    Given Two positive-zero input values, 1 and 0
    When I call func with two values
    Then I expect the result 0

  Scenario: sqrt of division of two zero-zero number
    Given Two zero-zero input values, 0 and 0
    When I call func with two values
    Then I expect the result 0