package ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TC_1822page {

    public TC_1822page()    { PageFactory.initElements(Driver.getDriver(),this); }

    @FindBy(xpath = "//div/a/img")
    public WebElement automationExerciseLogo;
//upper menu
    @FindBy(xpath = "//a[text()=' Home']")
    public WebElement homeButton;

    @FindBy(xpath ="//a[text()=' Products']")
    public WebElement productsButton;
        @FindBy(id = "sale_image")
        public WebElement bigSaleImage;
    @FindBy(xpath = "//a[text()=' Cart']")
    public WebElement cartButton;
    @FindBy(xpath = "//a[text()=' Signup / Login']")
    public WebElement signLoginButton;

    // left side menu
    @FindBy(xpath = "//h2[.='Category']")
    public WebElement categoryLeftMenu;
    @FindBy(xpath = "//div[@class='single-products']/div/p")
    public WebElement categoryFirstItemCheck;
        @FindBy(xpath = "//h4/a[@data-toggle='collapse']")
        public WebElement categoryWomen;
        @FindBy(xpath ="//div[@class='panel-body']/ul/li[1]/a")
        public WebElement categoryWomenDress;
        @FindBy(xpath = "//div[@class='panel-body']/ul/li[2]/a")
        public WebElement categoryWomenTops;
        @FindBy(xpath = "//div[@class='panel-body']/ul/li[3]/a")
        public WebElement categoryWomenSaree;
            @FindBy(xpath = "//a[@href='#Men']")
            public WebElement categoryMen;
            @FindBy(xpath = "//a[text()='Tshirts ']")
            public WebElement categoryMenTshirts;
            @FindBy(xpath = "//a[text()='Jeans ']")
            public WebElement categoryMenJeans;
                @FindBy(xpath = "//a[@href='#Kids']")
                public WebElement categoryKids;
                @FindBy(xpath = "(//a[.='Dress '])[2]")
                public WebElement categoryKidsDress;
                @FindBy(xpath = "//a[.='Tops & Shirts ']")
                public WebElement categoryKidsTopsShirts;
    @FindBy(xpath = "(//a[.='Add to cart'])[1]")
    public WebElement addToCart;

    //Brands
    @FindBy(xpath = "(//div[@class='brands-name']/ul/li)")    //[1]/a")
    public WebElement brandsSec;
    @FindBy(xpath = "//div[@class='features_items']/h2")
    public WebElement brandProductTitleCheck;
        @FindBy(xpath = "//a[text()='Polo']")
        public WebElement brandsPolo;

    @FindBy(id="search_product")
    public WebElement productSearchInputBox;
    @FindBy(id = "submit_search")
    public WebElement productSearchButton;

    @FindBy(xpath = "//div[@class='modal-footer']/button")
    public WebElement continueShoppingButton;
    @FindBy(xpath ="//div[@class='modal-body']/p[2]/a")               //"//p/a/u[text()='View Cart']")
    public WebElement viewCart;
        @FindBy(xpath = "(//a[text()='View Product'])[1]")
        public WebElement allProductsFirstViewProduct;
        @FindBy(xpath = "//div[@class='col-sm-12']/ul/li/a")
        public WebElement writeYourReviewButton;
        @FindBy(xpath = "//input[@id='name']")
        public WebElement reviewNameInput;
        @FindBy(id = "button-review")
        public WebElement reviewSubmitButton;
            @FindBy(xpath = "//span[text()='Thank you for your review.']")
            public WebElement reviewSubmitThankMessage;

    @FindBy(xpath = "//*[text()=' Signup / Login']")
    public WebElement signUpLoginButton;
    @FindBy(name = "email")
    public WebElement loginEmailInput;

    @FindBy(xpath = "//h2[text()='recommended items']")
    public WebElement recommendedItems;
    @FindBy(xpath = "(//a[text()='Add to cart'])[1]")
    public WebElement firstRecommendedItemAddtoCart;
    @FindBy(xpath = "//a/u[text()='View Cart']")
    public WebElement recommendedPopupViewCart;
    @FindBy(xpath = "(//div[@class='single-products']/div/p)[35]")
    public WebElement recommendedFirstItemTitle;
    @FindBy(xpath = "//tr[@id='product-1']/td[2]/h4/a")
    public WebElement recommendCartFirstItem;


}
