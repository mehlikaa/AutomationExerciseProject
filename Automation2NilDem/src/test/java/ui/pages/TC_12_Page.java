package ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class TC_12_Page {

    public TC_12_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//a[@data-product-id='1']")
    public WebElement firstProduct;
    @FindBy(xpath = "//button[contains(text(),'Continue Shopping')]")
    public WebElement continueShopping;
    @FindBy(xpath ="//a[@data-product-id='2']")
    public WebElement secondProduct;
    @FindBy(xpath = "//u[contains(text(),'View Cart')]")
    public WebElement viewCart;
    @FindBy(xpath = "//a[.='Blue Top']")
    public WebElement womenProduct;
    @FindBy(xpath = "//a[.='Men Tshirt']")
    public WebElement menProduct;
    @FindBy(xpath = "//tr")
    public List<WebElement> cartRow;


}
