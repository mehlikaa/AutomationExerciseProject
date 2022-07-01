package ui.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import ui.pages.TC_1822page;
import utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.List;

public class TC_22sd {
    TC_1822page locator=new TC_1822page();
    static List<String> recommendedCartList=new ArrayList<>();

    @Given("m Scroll to bottom of page")
    public void m_scroll_to_bottom_of_page() {
        ReusableMethods.scrollToWebelementVisible(locator.recommendedItems);
    }
    @Then("m Verify RECOMMENDED ITEMS are visible")
    public void m_verify_recommended_items_are_visible() {
        Assert.assertTrue(locator.recommendedItems.isDisplayed());
        System.out.println("Recommended Title : "+locator.recommendedItems.getText());
    }
    @Then("m Click on Add To Cart on Recommended product")
    public void m_click_on_add_to_cart_on_recommended_product() throws InterruptedException {
        ReusableMethods.scrollToWebelementVisible(locator.recommendedItems);
        System.out.println("ilk recommend urun : "+locator.recommendedFirstItemTitle.getText());
        recommendedCartList.add(locator.recommendedFirstItemTitle.getText());
        System.out.println("eklendi mi : "+ recommendedCartList);
        System.out.println("size : " + recommendedCartList.size() );

        ReusableMethods.waitForClickablility(locator.firstRecommendedItemAddtoCart,1).click();
        Thread.sleep(1);
        System.out.println(recommendedCartList.get(0));
    }
    @Then("m Click on View Cart button")
    public void m_click_on_view_cart_button() throws InterruptedException {
        Thread.sleep(2);
        locator.recommendedPopupViewCart.click();

    }
    @Then("m Verify that product is displayed in cart page")
    public void m_verify_that_product_is_displayed_in_cart_page() {
        System.out.println("recommend cart first text : "+locator.recommendCartFirstItem.getText());
        System.out.println("list : "+ recommendedCartList);
        Assert.assertEquals(recommendedCartList,locator.recommendCartFirstItem.getText());
    }
}
