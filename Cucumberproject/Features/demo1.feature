Feature: product purchase

  Background:
    Given App is up
    Scenario:registrartion
    Given register
    And enter username and password
@FunctionalTest @Smoke
  Scenario Outline: microwave purchase
    Given Jhon purchse a microwave for <price> doll
    And he has a recepit
    When Jhon returened the faulty product
    Then he got refund of <price> doll

    Examples:
      | price |
      |   100 |
      |   200 |
      |   300 |
@Regression @Smoke
  Scenario: microwave purchase
    Given Jhon purchse a microwave for 400 doll
    And he has a recepit
    When Jhon returened the faulty product
    Then he got refund of 400 doll
@FunctionalTest @Smok
  Scenario: microwave purchase
    Given Jhon purchse a microwave for 500 doll
    And he has a recepit
    When Jhon returened the faulty product
    Then he got refund of 500
    
@Datadrive
Scenario: Credentials
Given credentials are
|user1|
|user2|
|user3|
|user4|