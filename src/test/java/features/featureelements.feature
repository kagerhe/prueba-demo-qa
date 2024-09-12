Feature: Elements Interaction

 # Interacción con el Text Box
  Scenario: Interact with text box and check box
    Given The user is on the home page
    When The user clicks on the Elements option
    And The user selects the TextBox option
    And The user fills in the fields with name "Karina Gerdez", email "kagerhe@gmail.com", address "avenida 40 Bello", and secondary address "Avenida 50 Medellín"
    And The user clicks on the Submit button
    Then The form should display the entered data below in the output

    # Interacción con los Check Boxes
     Scenario: Interact with check boxes
    When The user selects the CheckBox option
    And The user selects Check Box Home
    And The user selects Check Box Desktop
    And The user selects Check Box Notes
    And The user selects Check Box Documents
    And The user selects Check Box Workspace
    And The user selects Check Box Office
    And The user selects Check Box Download
    And The user selects Check Box Word
    Then The output should display the selected checkboxes

    # Interacción con los Radio Buttons
    Scenario: Interact with radio buttons
    When The user selects the Radio Button option
    And The user selects the Yes radio button
    Then The output should display "Yes"
    When The user selects the Impressive radio button
    Then The output should display "Impressive"

    # Interacción con la Web Table
    Scenario: Interact with web table
    When The user selects the Web Table option
    And The user clicks on the "Add" button
    And The user fills the web table form with first name "Marcela", last name "Juarez", age "30", email "marcej@gmail.com", salary "5000000", and department "Operaciones"
    And The user submits the web table form
    Then The table should display an entry with the first name "Marcela" and last name "Juarez"
    
