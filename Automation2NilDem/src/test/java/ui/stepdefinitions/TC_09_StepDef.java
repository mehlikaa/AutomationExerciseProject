package ui.stepdefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import ui.pages.TC_09_Page;
import utilities.ConfigReader;
import utilities.Driver;

public class TC_09_StepDef {

    TC_09_Page tc09Page = new TC_09_Page();

    @Given("user goes on the automation exercise home page")
    public void user_goes_on_the_automation_exercise_home_page() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }

    @Given("Verify that home page is visible successfully")
    public void verify_that_home_page_is_visible_successfully() {
        //  Driver.getDriver().getTitle();
        Assert.assertTrue("Website for automation practice", tc09Page.verifyHomePage.isDisplayed());
    }

    @Given("Click on Products button")
    public void click_on_products_button() {
        //1 way
        //   tc09Page.productsButton.click();
        //2 way
        tc09Page.productsButton.sendKeys(Keys.ENTER);

    }

    @Given("Verify user is navigated to ALL PRODUCTS page successfully")
    public void verify_user_is_navigated_to_all_products_page_successfully() {
        Assert.assertEquals(tc09Page.allProductPage.getText(), "ALL PRODUCTS");
    }

    @Given("Enter product name {string} in search input and click search button")
    public void enter_product_name_in_search_input_and_click_search_button(String productName) {
        tc09Page.searchProduct.sendKeys(productName);
        tc09Page.submitSearch.click();
    }

    @When("Verify {string} is visible")
    public void verify_is_visible(String productName) {
        for (int i = 0; i < tc09Page.verifySearchProduct.size(); i++) {
            if (tc09Page.verifySearchProduct.get(i).getText().contains(productName)) {
                Assert.assertEquals(tc09Page.verifySearchProduct.get(i).getText(), productName);
            }

        }
    }

    @Then("Verify all the products related to search are visible")
    public void verify_all_the_products_related_to_search_are_visible() {
        for (int i = 0; i < tc09Page.verifySearchProduct.size(); i++) {
            if (tc09Page.verifySearchProduct.get(i).getText().contains("ecommerce website products")) {
                Assert.assertEquals(tc09Page.verifySearchProduct.get(i).getText(), "ecommerce website products");
            }

        }
    }

}
