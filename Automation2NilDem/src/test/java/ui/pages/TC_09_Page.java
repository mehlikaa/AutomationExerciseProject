package ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class TC_09_Page {

    public TC_09_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//img[@alt='Website for automation practice']")
    public WebElement verifyHomePage;
    @FindBy(xpath = "//a[@href='/products']")
    public WebElement productsButton;
    @FindBy(xpath = "//h2[@class='title text-center']")
    public WebElement allProductPage;
    @FindBy(id = "search_product")
    public WebElement searchProduct;
    @FindBy(id = "submit_search")
    public WebElement submitSearch;
    @FindBy(xpath = "//p[contains(text(),'Dress')]")
    public List<WebElement> verifySearchProduct;
}
