@Login
Feature: Verify Adactin Login Details

  Scenario Outline: Verifying Adactin Login Details with Valid Credentials
    Given User is on the Adactin page
    When User should enter "<username>", "<password>"
    Then User should verify after login "Hello Gokilapr!"

    Examples: 
      | username | password |
      | Gokilapr | 94B54F   |

  Scenario Outline: Verifying Login Details using Enter Key
    Given User is on the Adactin page
    When User Should login with the help of enter key "<username>", "<password>"
    Then User should verify after login "Hello Gokilapr!"

    Examples: 
      | username | password |
      | Gokilapr | 94B54F   |

  Scenario Outline: Verifying Adactin Login Details With InValid Credentials
    Given User is on the Adactin page
    When User should enter "<username>", "<password>"
    Then User Should verify Login Error Message contains "Invalid Login details or Your Password might have expired"

    Examples: 
      | username | password |
      | Gokilapr | 94B54D   |
