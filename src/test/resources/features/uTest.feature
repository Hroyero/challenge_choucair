#Autor: Hollmans Royero Mendoza
@stories
Feature: uTest
  As a user, I want to be able to register on the Utest page

  @scenario1
  Scenario Outline: search for registration option in Utest
    Given  Pedro wants to register in Utest
    When he search for the option to registe and fill the registration form
      | strFirstName   | strLastName   | strEmailAddress   | strMonth   | strDay   | strYear   | strCity   | strPostal     | strPassword   | strConfirmPassword   |
      | <strFirstName> | <strLastName> | <strEmailAddress> | <strMonth> | <strDay> | <strYear> | <strCity> | <strPostal>   | <strPassword> | <strConfirmPassword> |
    Then he registers on the page
      | strRegistered    |
      | <strRegistered>  |

    Examples:
      | strFirstName   | strLastName | strEmailAddress        |  strMonth   | strDay    | strYear     |  strCity | strPostal |   strPassword   | strConfirmPassword   | strRegistered                                                          |
      | Hollmans       | Royero      | cidavin396@slowimo.com |  number:7   | number:22 | number:1996 |  Bogota  | 110931    |  0btCnxzxXt&8   | 0btCnxzxXt&8         | Welcome to the world's largest community of freelance software testers!|