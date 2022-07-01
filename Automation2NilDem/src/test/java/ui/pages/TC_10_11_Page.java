package ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TC_10_11_Page {
    public TC_10_11_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//h2[.='Subscription']")
    public WebElement subscriptionText;
    @FindBy(id = "susbscribe_email")
    public WebElement subscribeEmail;
    @FindBy(xpath = "//i[@class='fa fa-arrow-circle-o-right']")
    public WebElement emailSubmitBottom;
    @FindBy(xpath = "//*[contains(text(),'You have been successfully subscribed!')]")
    public WebElement successSubscribe;
    @FindBy(xpath = "(//a[@href='/view_cart'])[1]")
    public WebElement cartBottom;

}
