#Autor: Hollmans Royero Mendoza
  @stories
  Feature: uTest
    As a user, I want to be able to register on the Utest page

  @scenario1
  Scenario Outline: search for registration option in Utest
    Given  Pedro wants to register in Utest
    When he search for the option to registe and fill the registration form
    | strFirstName   | strLastName   | strEmailAddress   | strMonth   | strDay   | strYear  | strPassword   | strConfirmPassword   |
    | <strFirstName> | <strLastName> | <strEmailAddress> | <strMonth> | <strDay> | <strYear>| <strPassword> | <strConfirmPassword> |
    Then he registers on the page
      | strRegistered    |
      | <strRegistered>  |

    Examples:
      | strFirstName   | strLastName | strEmailAddress      |  strMonth   | strDay    | strYear     | strPassword   | strConfirmPassword   | strRegistered                                                          |
      | Hollmans       | Royero      | motrorerza@biyac.com |  number:7   | number:22 | number:1996 | 0btCnxzxXt&8  | 0btCnxzxXt&8         | Welcome to the world's largest community of freelance software testers!|