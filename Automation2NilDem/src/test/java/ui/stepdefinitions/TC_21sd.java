package ui.stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import ui.pages.TC_1822page;

public class TC_21sd {
    TC_1822page locator=new TC_1822page();

    @Then("m verify user is navigated to ALL PRODUCTS page successfully")
    public void m_verify_user_is_navigated_to_all_products_page_successfully() {
        Assert.assertTrue(locator.brandProductTitleCheck.isDisplayed());
    }
    @Then("m Click on View Product button")
    public void m_click_on_view_product_button() {
        locator.allProductsFirstViewProduct.click();
    }
    @Then("m Verify Write Your Review is visible")
    public void m_verify_write_your_review_is_visible() {
        Assert.assertTrue(locator.writeYourReviewButton.isDisplayed());
        Assert.assertTrue(locator.writeYourReviewButton.isEnabled());
        Assert.assertTrue(locator.writeYourReviewButton.getText().contains("REVIEW"));
    }
    @Then("m Enter name, email and review")
    public void m_enter_name_email_and_review() throws InterruptedException {
        locator.reviewNameInput.sendKeys("Mehlika"+Keys.TAB+"mehlika@gmail.com"+Keys.TAB+"Thank you so much for your quality");
        Thread.sleep(3);
    }

    @Then("m Click Submit button")
    public void m_click_submit_button() {
        locator.reviewSubmitButton.click();
    }

    @Then("m Verify success message; Thank you for your review.")
    public void m_verify_success_message_thank_you_for_your_review() {
        Assert.assertTrue(locator.reviewSubmitThankMessage.isDisplayed());
        Assert.assertTrue(locator.reviewSubmitThankMessage.getText().contains("Thank you"));
        System.out.println("Thank you message = " + locator.reviewSubmitThankMessage.getText());
    }
}
