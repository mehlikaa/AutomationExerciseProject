package ui.stepdefinitions;

import io.cucumber.java.en.Given;
import ui.pages.TC_10_11_Page;
import utilities.ReusableMethods;

public class TC_11_StepDef {

    TC_10_11_Page tc1011Page =new TC_10_11_Page();

    @Given("Click {string} button")
    public void click_button(String string) {
        ReusableMethods.waitFor(2);
        tc1011Page.cartBottom.click();
    }
}
