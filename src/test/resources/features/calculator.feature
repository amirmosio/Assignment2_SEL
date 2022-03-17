@tag
Feature: Calculator

  Scenario: add two numbers
    Given Add two input values, 1 and 2
    When I add the two values
    Then I expect the result 3 from add

  Scenario Outline: add two numbers
    Given Add two input values, <first> and <second>
    When I add the two values
    Then I expect the result <result> from add
    Examples:
      | first | second | result |
      | 1     | 12     | 13     |
      | -1    | 6      | 5      |
      | 2     | 2      | 4      |

  Scenario: sqrt of division of two positive number
    Given SQRT two input values, 1 and 4
    When I call func with two values
    Then I expect the result 0.5 from sqrt

  Scenario: sqrt of division of two negative number
    Given SQRT two input values, -1 and -4
    When I call func with two values
    Then I expect the result 0.5 from sqrt

  Scenario: sqrt of division of two positive-negative number
    Given SQRT two input values, 1 and -4
    When I call func with two values
    Then I expect the result "sqrt of negative number" from sqrt

  Scenario: sqrt of division of two negative-positive number
    Given SQRT two input values, -1 and 4
    When I call func with two values
    Then I expect the result "sqrt of negative number" from sqrt

  Scenario: sqrt of division of two negative-zero number
    Given SQRT two input values, -1 and 0
    When I call func with two values
    Then I expect the result "sqrt of negative number" from sqrt

  Scenario: sqrt of division of two positive-zero number
    Given SQRT two input values, 1 and 0
    When I call func with two values
    Then I expect the result infinity from sqrt

  Scenario: sqrt of division of two zero-zero number
    Given SQRT two input values, 0 and 0
    When I call func with two values
    Then I expect the result infinity from sqrt

  Scenario Outline: sqrt of division of two number
    Given SQRT two input values, <first> and <second>
    When I call func with two values
    Then I expect the result <result> from sqrt
    Examples:
      | first | second | result                  |
      | 1     | 16     | 0.25                    |
      | -1    | -16    | 0.25                    |
      | -1    | 16     | sqrt of negative number |
      | 1     | -16    | sqrt of negative number |
      | 0     | -16    | 0                       |
      | 1     | 0      | infinity                |
      | 0     | 0      | infinity                |

