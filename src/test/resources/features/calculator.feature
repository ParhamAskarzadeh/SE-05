@tag
Feature: Calculator


  Scenario: calculate two numbers
    Given Two input values, 10 and 2
    When I calculate two values
    Then I expect the result 2.236

  Scenario: calculate two numbers
    Given Two input values, 36 and 4
    When I calculate two values
    Then I expect the result 3


  Scenario Outline: calculate two numbers
    Given Two input values, <first> and <second>
    When I calculate two values
    Then I expect the result <result>
    Examples:
      | first | second | result |
      | 162   | 2      | 9      |
      | 9     | 0      | error  |
      | 100   | 4      | 5      |
      | 1653  | 742    | 1.49   |
      | 296   | 4      | 8.6    |
