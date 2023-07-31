Feature: Hrm Data Driver Test

  Scenario Outline: Test the Login of Hrm
    Given Open OrangeHrm application
    When User enter username "<un>" and enter password "<psw>"
    When User click on hrm login button
    Then as per valid data user should be able to login

    Examples: 
      | un    | psw      |
      | Admin | admin123 |
      | pooja | test123  |
      | Admin | admin123 |
