package com.automation.pages;

public interface LoginPage {

    void openApplication();

    boolean isLoginScreenDisplayed();

    void doLogin(String username, String password);

    boolean isLockedOutUserErrorMessageIsDisplayed();

    String getLockedOutErrorMessage();
}
