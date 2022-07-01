package ui.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import ui.pages.TC_10_11_Page;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_10_StepDef {

    TC_10_11_Page tc10Page = new TC_10_11_Page();
    Actions actions = new Actions(Driver.getDriver());


    @Given("Scroll down to footer")
    public void scroll_down_to_footer() {
        actions.sendKeys(tc10Page.subscriptionText, Keys.PAGE_DOWN).perform();

    }

    @Given("Verify text {string}")
    public void verify_text(String subscription) {
        ReusableMethods.waitFor(2);
        Assert.assertEquals(tc10Page.subscriptionText.getText(), subscription);

    }

    @Given("Enter email address {string} in input and click arrow button")
    public void enter_email_address_in_input_and_click_arrow_button(String email) {
        tc10Page.subscribeEmail.sendKeys(email);
        ReusableMethods.waitFor(2);
        tc10Page.emailSubmitBottom.click();
    }

    @Then("Verify success message {string} is visible")
    public void verify_success_message_is_visible(String text) {
        Assert.assertTrue(tc10Page.successSubscribe.getText().equals(text));

    }


}
