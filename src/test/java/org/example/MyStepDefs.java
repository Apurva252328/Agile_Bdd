package org.example;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepDefs {
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    CellPhone cellPhone = new CellPhone();
    NokiaLumia nokiaLumia = new NokiaLumia();
    Cart cart = new Cart();
    Checkout checkout = new Checkout();
    ShippingMethod shippingMethod = new ShippingMethod();
    PaymentMethod paymentMethod = new PaymentMethod();
    PaymentInformation paymentInformation = new PaymentInformation();
    ConformOrder conformOrder = new ConformOrder();
    RegisterResultPage registerResultPage = new RegisterResultPage();
    @Given("I am registered user")
    public void i_am_registered_user() {
        // Write code here that turns the phrase above into concrete actions
        homePage.verifyRegisterButtonPresent();


    }
    @When("I registered successfully")
    public void iRegisteredSuccessfully() {
        registerPage.enterRegistrationDetails();
    }
    @And("I select cell phone from electronics category")
    public void iSelectCellPhoneFromElectronicsCategory() {
        homePage.verifyElectronicPage();
        cellPhone.verifyCellPhone();

    }

    @And("I select NokiaLumia Product")
    public void iSelectNokiaLumiaProduct() {
        nokiaLumia.verifyNokiaLumia();
    }
    @When("I add product to cart")
    public void i_add_product_to_cart() {
        // Write code here that turns the phrase above into concrete actions
        cart.verifyCartButton();
    }
    @When("I enter personal details for checkout")
    public void i_enter_personal_details_for_checkout() {
        // Write code here that turns the phrase above into concrete actions
        checkout.verifybilling();
        shippingMethod.verifyShippingMethod();
    }
    @When("I enter valid card details")
    public void i_enter_valid_card_details() {
        // Write code here that turns the phrase above into concrete actions
        paymentMethod.verifyPaymentMethod();
        paymentInformation.verifyPaymentInformation();
    }
    @Then("I should able to buy product successfully")
    public void i_should_able_to_buy_product_successfully() {
        // Write code here that turns the phrase above into concrete actions
        conformOrder.verifyConformOrder();
    }


    @When("I click on {string} link")
    public void iClickOnLink(String categoryLink) {
    homePage.clickOnCategoryPage(categoryLink);
    }

    @Then("I should able to see to related {string} page successfully")
    public void iShouldAbleToSeeToRelatedPageSuccessfully(String categoryName) {
        Utils.assertCurrentUrl(categoryName);
    }

    @Given("I am register page")
    public void iAmRegisterPage() {
     homePage.verifyRegisterButtonPresent();
    }

    @When("I enter valid credentials")
    public void iEnterValidCredentials() {
     registerPage.verifyUserIsOnRegistrationPage();
    }

    @And("I Should click on Register button")
    public void iShouldClickOnRegisterButton() {
        registerPage.enterRegistrationDetails();
    }

    @Then("I should able to register successfully")
    public void iShouldAbleToRegisterSuccessfully() {
    registerResultPage.verifyRegisterResult();
    }
}
