Feature: Control of products feature


  @Smoke @Regression
  Scenario: Controlling the visibility of products
    Given Navigate to website
    When Products sections control
    Then Online payment solutions check
    And Physical payment solutions control
    And Alternative payment solutions check

