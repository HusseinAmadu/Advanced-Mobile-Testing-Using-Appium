Feature: Create new task
  Scenario Outline: The user can add new task
    Given Clcik add new task
    Given Enter "<TaskName>" and "<TaskDesc>"
    Then Task added succefully

    Examples:
      | TaskName        | TaskDesc       |
      | Cucumber Task 1 | Task 1 details |
      | Cucumber Task 2 | Task 2 Details |