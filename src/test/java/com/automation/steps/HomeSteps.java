package com.automation.steps;

import com.automation.pages.HomePage;
import com.automation.pages.AndroidHomePage;
import com.automation.pages.iOSHomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class HomeSteps {

    HomePage homePage;

    public HomeSteps() {
        String env = System.getProperty("platform");

        if (env.equals("ios")) {
            homePage = new iOSHomePage();
        } else {
            homePage = new AndroidHomePage();
        }
    }

    @Then("verify user is on the home screen")
    public void verify_user_is_on_the_home_screen() {
        Assert.assertTrue(homePage.isHomeScreenDisplayed());
    }

    @Then("click on the hamburger menu")
    public void clickOnTheHamburgerMenu() {
        homePage.clickOnHamburgerMenu();

    }

    @Then("click on logout button")
    public void clickOnLogoutButton() {
        homePage.clickOnLogoutBtn();
    }

    @Then("verify user is on home screen")
    public void verifyUserIsOnHomeScreen() {
        homePage.isHomeScreenDisplayed();
    }

    @When("user click on filter icon")
    public void userClickOnFilterIcon() {
        homePage.clickOnFilterIcon();
    }

    @And("select the filter {string}")
    public void selectTheFilter(String filterOption) {
        homePage.selectFilterOption(filterOption);
    }

    @Then("verify all the product sorted by alphabetically")
    public void verifyAllTheProductSortedByAlphabetically() {
        Assert.assertTrue(homePage.verifyAlphabeticalOrder());
    }

    @Then("verify all the product sorted by price in descending order")
    public void verifyAllTheProductSortedByPriceInDescendingOrder() {
    }

    @And("verify details of product on homepage and product details page")
    public void verifyDetailsOfProductOnHomepageAndProductDetailsPage() {
    }

    @When("user click on the product {string}")
    public void userClickOnTheProduct(String arg0) {
    }
}
