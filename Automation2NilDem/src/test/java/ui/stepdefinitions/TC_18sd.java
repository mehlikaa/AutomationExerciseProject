package ui.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import ui.pages.TC_1822page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_18sd {
    TC_1822page locator=new TC_1822page();
    Actions action=new Actions(Driver.getDriver());

    @Given("m Launch browser and navigate to url")
    public void m_launch_browser_and_navigate_to_url()  {
        Driver.getDriver().get(ConfigReader.getProperty("exerciseUrl"));
    }

    @Then("m Verify that categories are visible on left side bar")
    public void m_verify_that_categories_are_visible_on_left_side_bar() throws InterruptedException {
        ReusableMethods.scrollToWebelementVisible(locator.categoryLeftMenu);
        Thread.sleep(1);
        Assert.assertTrue(locator.categoryLeftMenu.isDisplayed());
        Assert.assertTrue(locator.categoryWomen.isDisplayed());
        Assert.assertTrue(locator.categoryMen.isDisplayed());
        Assert.assertTrue(locator.categoryKids.isDisplayed());
    }

    @Then("m Click on WOMEN category")
    public void m_click_on_women_category() throws InterruptedException {
        Thread.sleep(1);
        locator.categoryWomen.click();
    }

    @Then("m Click on any category link under WOMEN category")
    public void m_click_on_any_category_link_under_women_category() throws InterruptedException {
        locator.categoryWomenDress.click();
        Thread.sleep(1);
        locator.categoryWomen.click();
        Thread.sleep(1);
        locator.categoryWomenSaree.click();
        Thread.sleep(1);
        locator.categoryWomen.click();
        Thread.sleep(1);
        locator.categoryWomenTops.click();
        Thread.sleep(1);
    }

    @Then("m Verify that category page is displayed and confirm text WOMEN PRODUCTS")
    public void m_verify_that_category_page_is_displayed_and_confirm_text_women_products() throws InterruptedException {
            locator.categoryWomen.click();
            Thread.sleep(1);
                Assert.assertTrue(locator.categoryWomenDress.isEnabled());
            locator.categoryWomenDress.click();
            Thread.sleep(1);
                Assert.assertTrue(locator.categoryFirstItemCheck.getText().contains("Dress"));
                System.out.println("Women Dress  = " + locator.categoryFirstItemCheck.getText());
            locator.categoryWomen.click();
            Thread.sleep(1);
                Assert.assertTrue(locator.categoryWomenTops.isEnabled());
            locator.categoryWomenTops.click();
            Thread.sleep(1);
                Assert.assertTrue(locator.categoryFirstItemCheck.getText().contains("Top"));
                System.out.println("Women Tops  = " + locator.categoryFirstItemCheck.getText());
            locator.categoryWomen.click();
            Thread.sleep(1);
                Assert.assertTrue(locator.categoryWomenSaree.isEnabled());
            locator.categoryWomenSaree.click();
            Thread.sleep(1);
                Assert.assertTrue(locator.categoryFirstItemCheck.getText().contains("Saree"));
                System.out.println("Women Saree  = " + locator.categoryFirstItemCheck.getText());
    }

    @Then("m On left side bar, click on any sub-category link of MEN category")
    public void m_on_left_side_bar_click_on_any_sub_category_link_of_men_category() throws InterruptedException {
        locator.categoryMen.click();
        Thread.sleep(1);
            locator.categoryMenJeans.click();
            Thread.sleep(2);
        locator.categoryMen.click();
        Thread.sleep(1);
            locator.categoryMenTshirts.click();
            Thread.sleep(1);
    }

    @Then("m Verify that user is navigated to that category page")
    public void m_verify_that_user_is_navigated_to_that_category_page() throws InterruptedException {
        locator.categoryMen.click();
        Thread.sleep(1);
        locator.categoryMenTshirts.click();
        System.out.println("Tshirt Text");
            Assert.assertTrue(locator.categoryFirstItemCheck.getText().contains("Tshirt"));
    }

}
