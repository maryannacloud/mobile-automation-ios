package com.automation.steps;

import com.automation.pages.ProductDetailPage;
import com.automation.pages.AndroidProductDetailsPage;
import com.automation.pages.iOSProductDetailsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductDetailSteps {

    ProductDetailPage productDetailPage;

    public ProductDetailSteps() {
        String env = System.getProperty("platform");

        if (env.equals("ios")) {
            productDetailPage = new AndroidProductDetailsPage();
        } else {
            productDetailPage = new iOSProductDetailsPage();
        }
    }
    
    @Then("verify product details page is displayed")
    public void verifyProductDetailsPageIsDisplayed() {
    }

    @When("user click on add to cart button")
    public void userClickOnAddToCartButton() {
    }

    @Then("verify cart icon display the quantity count {string}")
    public void verifyCartIconDisplayTheQuantityCount(String arg0) {

    }

    @When("user click on home burger menu")
    public void userClickOnHomeBurgerMenu() {

    }

    @And("click on the ALL ITEMS menu")
    public void clickOnTheALLITEMSMenu() {

    }

    @When("user click on cart icon")
    public void userClickOnCartIcon() {

    }

    @Then("verify user is on cart page")
    public void verifyUserIsOnCartPage() {

    }

    @When("user click on checkout button")
    public void userClickOnCheckoutButton() {
    }

    @Then("verify user is on checkout page")
    public void verifyUserIsOnCheckoutPage() {
    }

    @When("user fills all the checkout details")
    public void userFillsAllTheCheckoutDetails() {
    }

    @And("click on continue button on checkout page")
    public void clickOnContinueButtonOnCheckoutPage() {
    }

    @Then("verify user is on review page")
    public void verifyUserIsOnReviewPage() {
    }

    @When("user click on finish button on review page")
    public void userClickOnFinishButtonOnReviewPage() {
    }

    @Then("verify user is on order confirmation page")
    public void verifyUserIsOnOrderConfirmationPage() {
    }

    @When("user click on Back to Home button")
    public void userClickOnBackToHomeButton() {
    }
}
