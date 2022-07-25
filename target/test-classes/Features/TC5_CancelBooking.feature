@Cancel
Feature: Verify user is on the Cancel Booking Page

  Scenario Outline: Verify user is on the Cancel Booking page
    Given User is on the Adactin page
    When User should enter "<username>", "<password>"
    Then User should verify after login "Hello Gokilapr!"
    And User should Select all fields in search hotel page "<Location>" ,"<Hotels>","<RoomType>","<NumberofRooms>","<CheckInDate>","<CheckOutDate>","<AdultsPerRoom>" and "<ChildrenPerRoom>"
    Then User Should verify the message after search hotel "Select Hotel"
    And User should click the radio button and continue button in select hotel page
    Then User Should verify the message after select hotel "Book A Hotel"
    And User Should select all fields in book hotel page "<First Name>", "<Last Name>", "<Billing Address>" and Save the Generated Order id
      | Credit Card No   | Credit Card Type | Select Month | Select Year | CVV Number |
      | 4789652358452342 | VISA             | November     |        2022 |       5425 |
      | 4789652358452647 | American Express | December     |        2022 |       5425 |
      | 4789652358453647 | Master Card      | September    |        2022 |       5425 |
      | 4789652358423646 | Other            | October      |        2022 |       5425 |
    Then User Should Verify the message after clicking book now "Booking Confirmation"
    And User Should Cancel the generated Order Id
    Then User Should verify order id cancelled message after cancelling the booking "The booking has been cancelled."

    Examples: 
      | username | password | Location | Hotels       | RoomType | NumberofRooms | CheckInDate | CheckOutDate | AdultsPerRoom | ChildrenPerRoom | First Name | Last Name | Billing Address |
      | Gokilapr | 94B54F   | London   | Hotel Hervey | Standard | 1 - One       | 21-06-2022  | 22-06-2022   | 1 - One       | 1 - One         | Gokila     | Pr        | Chennai         |

  Scenario Outline: Verify the user Cancel the Existing order id
    Given User is on the Adactin page
    When User should enter "<username>", "<password>"
    Then User should verify after login "Hello Gokilapr!"
    And User Should cancel the Existing Order Id in the Booked Itinerary Page "<Order Id>"
    Then User Should verify order id cancelled message after cancelling the booking "The booking has been cancelled."

    Examples: 
      | username | password | Order Id   |
      | Gokilapr | 94B54F   | 216K3Z974Z |
