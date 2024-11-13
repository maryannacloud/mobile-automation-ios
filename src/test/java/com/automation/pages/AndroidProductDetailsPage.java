package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AndroidProductDetailsPage extends BasePage implements ProductDetailPage {

    @FindBy(xpath = "//android.widget.TextView[@text='Sauce Labs Backpack']/android.widget.TextView[1]")
    WebElement productTitle;

    @FindBy(xpath = "//android.widget.TextView[@content-desc='test-Price']")
    WebElement productPrice;

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc='test-Image Container']/android.widget.ImageView")
    WebElement productImage;

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc='test-ADD TO CART']")
    WebElement addToCartBtn;

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc='test-Cart']//android.widget.TextView")
    WebElement cartQuantity;

    public boolean isPDPageDisplayed() {
        int startX = productImage.getSize().getWidth() / 2;
        int endX = productImage.getSize().getWidth() / 2;;
        int startY = productImage.getSize().getHeight();
        int endY = productImage.getLocation().getY();

        scrollOrSwipe(startX, startY, endX, endY);
        return productTitle.isDisplayed() && productPrice.isDisplayed();
    }

    public void clickAddToCart(){
        addToCartBtn.click();
    }

    public String getCartQuantity(){
        return cartQuantity.getText();
    }
}
