package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AndroidLoginPage extends BasePage implements LoginPage {

    @FindBy(xpath = "//android.widget.EditText[@content-desc='test-Username']")
    WebElement usernameInput;

    @FindBy(xpath = "//android.widget.EditText[@content-desc='test-Password']")
    WebElement passwordInput;

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-LOGIN\"]")
    WebElement loginBtn;

    @FindBy(xpath = "//android.widget.TextView[@text='Sorry, this user has been locked out.']")
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
