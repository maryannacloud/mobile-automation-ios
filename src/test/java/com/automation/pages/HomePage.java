package com.automation.pages;

public interface HomePage {

    boolean isHomeScreenDisplayed();

    void clickOnHamburgerMenu();

    void clickOnLogoutBtn();

    void clickOnFilterIcon();

    void selectFilterOption(String filterOption);

    boolean verifyAlphabeticalOrder();

    void clickOnProduct();
}
