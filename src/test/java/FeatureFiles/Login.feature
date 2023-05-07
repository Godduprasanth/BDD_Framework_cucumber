#Author: G Prasanth

Feature: Login to Vtiger Application

  Scenario: Login to VTiger appication with valid credentials
    Given I want to launch the browser
    And I want to load the URL
    When Login page is dispalyed enter username and password
    And Click on Login
    Then I validate for home page

