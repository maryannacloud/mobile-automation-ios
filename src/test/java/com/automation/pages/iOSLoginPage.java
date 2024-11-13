package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class iOSLoginPage extends BasePage implements LoginPage {

    @FindBy(id = "test-Username")
    WebElement usernameInput;

    @FindBy(id = "test-Password")
    WebElement passwordInput;

    @FindBy(id = "test-LOGIN")
    WebElement loginBtn;

    @FindBy(id = "test-Error message")
    WebElement lockedOutErrorMsg;

    public void openApplication(){
        // intentionally left blank
    }

    public boolean isLoginScreenDisplayed(){
        return usernameInput.isDisplayed() && passwordInput.isDisplayed();
    }

    public void doLogin(String username, String password) {
        slowEnterText(username, usernameInput);
        passwordInput.sendKeys(password);
        loginBtn.click();
    }

    public void slowEnterText(String text, WebElement element) {

            for (char c : text.toCharArray()) {
                element.sendKeys(String.valueOf(c));
            }
    }

    public boolean isLockedOutUserErrorMessageIsDisplayed(){
        return lockedOutErrorMsg.isDisplayed();
    }

    public String getLockedOutErrorMessage(){
        return lockedOutErrorMsg.getText();
    }
}
