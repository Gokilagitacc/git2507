@Booking
Feature: Verify User is on the Book Hotel Page

  Scenario Outline: Verify user is on the Book Hotel page
    Given User is on the Adactin page
    When User should enter "<username>", "<password>"
    Then User should verify after login "Hello Gokilapr!"
    And User should Select all fields in search hotel page "<Location>" ,"<Hotels>","<RoomType>","<NumberofRooms>","<CheckInDate>","<CheckOutDate>","<AdultsPerRoom>" and "<ChildrenPerRoom>"
    Then User Should verify the message after search hotel "Select Hotel"
    And User should click the radio button and continue button in select hotel page
    Then User Should verify the message after select hotel "Book A Hotel"
    And User Should select all fields in book hotel page "<First Name>", "<Last Name>", "<Billing Address>" and Save the Generated Order id
      | Credit Card No   | Credit Card Type | Select Month | Select Year | CVV Number |
      | 7389747513254896 | VISA             | November     |        2022 |       5425 |
      | 4789652354523647 | American Express | December     |        2022 |       5425 |
      | 4789652354523647 | Master Card      | September    |        2022 |       5425 |
      | 4789652354523647 | Other            | October      |        2022 |       5425 |
    Then User Should Verify the message after clicking book now "Booking Confirmation"

    Examples: 
      | username | password | Location | Hotels       | RoomType | NumberofRooms | CheckInDate | CheckOutDate | AdultsPerRoom | ChildrenPerRoom | First Name | Last Name | Billing Address |
      | Gokilapr | 94B54F   | London   | Hotel Hervey | Standard | 1 - One       | 21-06-2022  | 22-06-2022   | 1 - One       | 1 - One         | Gokila     | Pr        | Chennai         |

  Scenario Outline: Verify without entering any field and click Book Now in Book Hotel Page
    Given User is on the Adactin page
    When User should enter "<username>", "<password>"
    Then User should verify after login "Hello Gokilapr!"
    And User should Select all fields in search hotel page "<Location>" ,"<Hotels>","<RoomType>","<NumberofRooms>","<CheckInDate>","<CheckOutDate>","<AdultsPerRoom>" and "<ChildrenPerRoom>"
    Then User Should verify the message after search hotel "Select Hotel"
    And User should click the radio button and continue button in select hotel page
    Then User Should verify the message after select hotel "Book A Hotel"
    And User need to click BookNow button without select any field
		Then User should verify the error message after clicking book now "Please Enter your First Name", "Please Enter you Last Name", "Please Enter your Address", "Please Enter your 16 Digit Credit Card Number", "Please Select your Credit Card Type", "Please Select your Credit Card Expiry Month" and "Please Enter your Credit Card CVV Number"

    Examples: 
      | username | password | Location | Hotels       | RoomType | NumberofRooms | CheckInDate | CheckOutDate | AdultsPerRoom | ChildrenPerRoom |
      | Gokilapr | 94B54F   | London   | Hotel Hervey | Standard | 1 - One       | 21-06-2022  | 22-06-2022   | 1 - One       | 1 - One         |
