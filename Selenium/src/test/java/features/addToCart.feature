Feature: BookCart Application Demo

@cleanup
Scenario Outline: Add a product to the cart
  Given User should navigate to the application
  And User should login as "<username>" and "<password>"
  And User search a "<book>"
  When User add the book to the cart
  Then the cart badge should be updated

@test
Examples:
  | username | password      | book            |
  | Absharu#12 | Absharu#123  | The Hookup      |
  | abarna03  | Abharnas#123   | The Simple Wild |

@dev  
Examples:
  | username | password      | book            |
  | Absharu#12 | Absharu#123  | The Hookup      |
  | abarna03  | Abharnas#123   | The Simple Wild |
