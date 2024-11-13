package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.w3c.dom.html.HTMLInputElement;

import java.util.List;

public class AndroidHomePage extends BasePage implements HomePage {

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name='PRODUCTS']")
    WebElement pageTitle;

    // NOTE: if there is an "id" available - we should be using "id" instead of "xpath" (id is preferable)
    // usually, in mobile testing, when we have "accessibility id", we can treat it as an "id" in the code
    @FindBy(xpath = "//android.view.ViewGroup[@content-desc='test-Menu']")
    WebElement hamburgerMenu;

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc='test-LOGOUT']")
    WebElement logoutBtn;

    @FindBy(id = "test-Modal Selector Button")
    WebElement filterIcon;

    String filterChoicesXpath = "//XCUIElementTypeOther[@name='XXXXX']";

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name='test-Item title']")
    List<WebElement> productNames;

    @FindBy(xpath = "//android.widget.TextView[@text='ALL ITEMS']")
    WebElement allItemsLink;

    String XPATH_PRODUCT_NAME = "//android.widget.TextView[@content-desc='test-Item title' and @text='%s']";

    public boolean isHomeScreenDisplayed(){
        return pageTitle.isDisplayed();
    }

    // sometimes in the Mobile Testing, we will experience that only a certain part of the Mobile Element is clickable - this is considered a Defect
    // in this case - when our code attempts to click on the Mobile Element - the Test will pass, but the "click" action will not be performed
    // the approach to solving this is: perform manual exploratory testing, observe and analyze the behavior of the application
    // by default - Selenium will attempt to click in the center of the Mobile Element
    public void clickOnHamburgerMenu(){
        int height = hamburgerMenu.getSize().getHeight();
        int width = hamburgerMenu.getSize().getWidth();

        int xDistance = hamburgerMenu.getLocation().getX();
        int yDistance = hamburgerMenu.getLocation().getY();

        // if we want to control whether we want to click more up or more bottom - we can utilize the "multiply by 0.9" (percentage)
        // if we want to click more down - the number will be higher, and if higher - the number will be lower
        int targetX = (int) (xDistance + width * 0.9);
        int targetY = (int) (yDistance + height * 0.9);

        tap(targetX, targetY);

        hamburgerMenu.click();
    }

    public void clickOnLogoutBtn() {
        logoutBtn.click();
    }


    public void clickOnFilterIcon() {
        filterIcon.click();
    }

    public void selectFilterOption(String filterOptionValue) {
        WebElement filterOptionElement = driver.findElement(By.xpath(filterChoicesXpath.replace("XXXXX", filterOptionValue)));
        filterOptionElement.click();
    }

    public boolean verifyAlphabeticalOrder() {

        if (productNames.isEmpty() || productNames.size() == 1) {
            return true;
        }

        String current = productNames.get(0).getAttribute("value");
        String next;

        for (int i = 1; i< productNames.size(); i++){

            //0 - when the Strings are the same;
            //1 - when the next string is alphabetically preceding current;
            //-1 - if the opposite to the above;
            next = productNames.get(i).getAttribute("value");

            if (current.compareTo(next) > 0){
                return false;
            }

            current = next;
        }

        return true;
    }

    @Override
    public void clickOnProduct() {
        String loc = String.format(XPATH_PRODUCT_NAME, productNames);
        driver.findElement(By.xpath(loc)).click();
    }

    public void clickOnAllItemsLink(){
        allItemsLink.click();
    }

}
