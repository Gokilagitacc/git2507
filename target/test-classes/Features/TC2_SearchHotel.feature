@Search
Feature: Verify User is on the Search Hotel Page

  Scenario Outline: Verifying Adactin Login Details with Valid Login Creadentials
    Given User is on the Adactin page
    When User should enter "<username>", "<password>"
    Then User should verify after login "Hello Gokilapr!"
    And User should Select all fields in search hotel page "<Location>" ,"<Hotels>","<RoomType>","<NumberofRooms>","<CheckInDate>","<CheckOutDate>","<AdultsPerRoom>" and "<ChildrenPerRoom>"
    Then User Should verify the message after search hotel "Select Hotel"

    Examples: 
      | username | password | Location | Hotels       | RoomType | NumberofRooms | CheckInDate | CheckOutDate | AdultsPerRoom | ChildrenPerRoom |
      | Gokilapr | 94B54F   | London   | Hotel Hervey | Standard | 1 - One       | 29/06/2022  | 29/06/2022   | 1 - One       | 1 - One         |

  Scenario Outline: Verify whether all the mandatory fields are Selected
    Given User is on the Adactin page
    When User should enter "<username>", "<password>"
    Then User should verify after login "Hello Gokilapr!"
    And User Should Select the Mandatory field in search hotel page"<Location>","<NumberofRooms>","<CheckInDate>","<CheckOutDate>"and"<AdultsPerRoom>"
    Then User Should verify the message after search hotel "Select Hotel"

    Examples: 
      | username | password | Location | NumberofRooms | CheckInDate | CheckOutDate | AdultsPerRoom |
      | Gokilapr | 94B54F   | London   | 1 - One       | 29/06/2022  | 30/06/2022   | 1 - One       |

  Scenario Outline: Verify CheckInDate and CheckOutDate
    Given User is on the Adactin page
    When User should enter "<username>", "<password>"
    Then User should verify after login "Hello Gokilapr!"
    And User should Select all fields in search hotel page "<Location>" ,"<Hotels>","<RoomType>","<NumberofRooms>","<CheckInDate>","<CheckOutDate>","<AdultsPerRoom>" and "<ChildrenPerRoom>"
    Then User should verify error message after search in both date field "Check-In Date shall be before than Check-Out Date", "Check-Out Date shall be after than Check-In Date"

    Examples: 
      | username | password | Location | Hotels       | RoomType | NumberofRooms | CheckInDate | CheckOutDate | AdultsPerRoom | ChildrenPerRoom |
      | Gokilapr | 94B54F   | London   | Hotel Hervey | Standard | 1 - One       | 29/06/2024  | 29/06/2022   | 1 - One       | 1 - One         |

  Scenario Outline: Verify without entering any field and click search
    Given User is on the Adactin page
    When User should enter "<username>", "<password>"
    Then User should verify after login "Hello Gokilapr!"
    And User need to click Search button without select any field
    Then User should verify the error message after search hotel "Please Select a Location"

    Examples: 
      | username | password |
      | Gokilapr | 94B54F   |
