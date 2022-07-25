@Select
Feature: Verify User is on Select Hotel Page

  Scenario Outline: Verify user in Select Hotel page
    Given User is on the Adactin page
    When User should enter "<username>", "<password>"
    Then User should verify after login "Hello Gokilapr!"
    And User should Select all fields in search hotel page "<Location>" ,"<Hotels>","<RoomType>","<NumberofRooms>","<CheckInDate>","<CheckOutDate>","<AdultsPerRoom>" and "<ChildrenPerRoom>"
    Then User Should verify the message after search hotel "Select Hotel"
    And User should click the radio button and continue button in select hotel page
    Then User Should verify the message after select hotel "Book A Hotel"

    Examples: 
      | username | password | Location | Hotels       | RoomType | NumberofRooms | CheckInDate | CheckOutDate | AdultsPerRoom |  | ChildrenPerRoom |
      | Gokilapr | 94B54F   | London   | Hotel Hervey | Standard | 1 - One       | 21-06-2022  | 22-06-2022   | 1 - One       |  | 1 - One         |

  Scenario Outline: Verify without entering any field and click search in Select Hotel
    Given User is on the Adactin page
    When User should enter "<username>", "<password>"
    Then User should verify after login "Hello Gokilapr!"
    And User should Select all fields in search hotel page "<Location>" ,"<Hotels>","<RoomType>","<NumberofRooms>","<CheckInDate>","<CheckOutDate>","<AdultsPerRoom>" and "<ChildrenPerRoom>"
    Then User Should verify the message after search hotel "Select Hotel"
    And User need to click continue button without select any hotel
    Then User should verify the error message in the select hotel page "Please Select a Hotel"

    Examples: 
      | username | password | Location | Hotels       | RoomType | NumberofRooms | CheckInDate | CheckOutDate | AdultsPerRoom |  | ChildrenPerRoom |
      | Gokilapr | 94B54F   | London   | Hotel Hervey | Standard | 1 - One       | 21-06-2022  | 22-06-2022   | 1 - One       |  | 1 - One         |
