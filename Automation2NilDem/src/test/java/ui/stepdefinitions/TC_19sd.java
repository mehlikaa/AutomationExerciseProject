package ui.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import ui.pages.TC_1822page;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_19sd {
    TC_1822page locator=new TC_1822page();
    Actions action=new Actions(Driver.getDriver());

    @Given("m Click on Products button")
    public void m_click_on_products_button() {
        locator.productsButton.click();
    }

    @Then("m Verify that Brands are visible on left side bar")
    public void m_verify_that_brands_are_visible_on_left_side_bar() {
        ReusableMethods.scrollToWebelementVisible(Driver.getDriver().findElement(By.xpath("//div[@class='brands-name']/ul/li[8]/a")));
    }

    @Then("m Click on any brand name {string}")
    public void m_click_on_any_brand_name(String brandNumber) throws InterruptedException {

        WebElement brandsSecWE=Driver.getDriver().findElement(By.xpath("(//div[@class='brands-name']/ul/li["+brandNumber+"]/a)"));
        Thread.sleep(2);
        brandsSecWE.click();
        Thread.sleep(2);
        System.out.println("Brands "+locator.brandProductTitleCheck.getText());

       }
    @Then("m Verify that user is navigated to brand page and brand products are displayed")
    public void m_verify_that_user_is_navigated_to_brand_page_and_brand_products_are_displayed() {

    }
    @Then("m On left side bar, click on any other brand link")
    public void m_on_left_side_bar_click_on_any_other_brand_link() {

    }
    @Then("m Verify that user is navigated to that brand page and can see products")
    public void m_verify_that_user_is_navigated_to_that_brand_page_and_can_see_products() {

    }
    @Then("m Verify that user can add to cart any chosen product")
    public void m_verify_that_user_can_add_to_cart_any_chosen_product() {

    }
}
