package ui.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import ui.pages.TC_12_Page;
import utilities.Driver;

public class TC_12_StepDef {
          TC_12_Page tc12Page =new TC_12_Page();
           Actions actions= new Actions(Driver.getDriver());
    @Given("Hover over first product and click Add to cart")
    public void hover_over_first_product_and_click_add_to_cart() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
      actions.moveToElement(tc12Page.firstProduct).perform();
       tc12Page.firstProduct.click();
    }

    @Given("Click Continue Shopping button")
    public void click_continue_shopping_button() {
        tc12Page.continueShopping.click();

    }
    @Given("Hover over second product and click Add to cart")
    public void hover_over_second_product_and_click_add_to_cart() {
        tc12Page.secondProduct.click();
    }
    @Given("Click View Cart button")
    public void click_view_cart_button() {
       tc12Page.viewCart.click();
    }
    @When("Verify both products are added to Cart")
    public void verify_both_products_are_added_to_cart() {
        Assert.assertTrue(tc12Page.womenProduct.getText().equals("Blue Top")&&
                tc12Page.menProduct.getText().equals("Men Tshirt"));
    }
    @Then("Verify their prices, quantity and total price")
    public void verify_their_prices_quantity_and_total_price() {
        for (int i = 0; i < tc12Page.cartRow.size(); i++) {
            //............
        }

    }

}
