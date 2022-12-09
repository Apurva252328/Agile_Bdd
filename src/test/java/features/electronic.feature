Feature:buying electronics product
  @electronic
  Scenario: verify register user should able to buy electronics product successfully
    Given I am registered user
    When I registered successfully
    And I select cell phone from electronics category
    And I select NokiaLumia Product
    And I add product to cart
    And I enter personal details for checkout
    And I enter valid card details
    Then I should able to buy product successfully
