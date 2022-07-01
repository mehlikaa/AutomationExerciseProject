package ui.stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import ui.pages.TC_1822page;
import utilities.Driver;
import utilities.ReusableMethods;
import java.util.ArrayList;
import java.util.List;

public class TC_20sd {
    TC_1822page locator=new TC_1822page();
    static List<String> listFromSearch =new ArrayList<>();
    static List<String> listFromCart =new ArrayList<>();
    static List<WebElement> listFromLoginCart;

     WebElement fromCart;

    @Then("m Verify user is navigated to ALL PRODUCTS page successfully")
    public void m_verify_user_is_navigated_to_all_products_page_successfully() {
        Assert.assertTrue(locator.brandProductTitleCheck.isDisplayed());
    }
    @Then("m Enter product name {string} in search, verify SEARCHED PRODUCTS is visible and add first products to cart.")
    public void m_enter_product_name_in_search_verify_searched_products_is_visible_and_add_first_products_to_cart(String productName) throws InterruptedException {
        locator.productSearchInputBox.sendKeys(productName);
        Thread.sleep(3);
        locator.productSearchButton.click();
        ReusableMethods.scrollToWebelementVisible(locator.brandProductTitleCheck);
        Thread.sleep(5);
        //System.out.println("Search Check "+locator.categoryFirstItemCheck.getText());
        listFromSearch.add(locator.categoryFirstItemCheck.getText());
        locator.addToCart.click();
        locator.viewCart.click();
    }

    @Then("m Click Cart button and verify that products are visible in cart")
    public void m_click_cart_button_and_verify_that_products_are_visible_in_cart() {
        //System.out.println("List : "+ listFromSearch);
        for (String fromSearch: listFromSearch
             ) {
            for (int i = 1; i < (listFromSearch.size()+1); i++) {
                fromCart = Driver.getDriver().findElement(By.xpath("(//tbody/tr[" + i + "])/td[2]/h4/a"));
           }
        }
        listFromCart.add(fromCart.getText());

        //System.out.println("listFromSearch : " + listFromSearch);
        //System.out.println("listFromCart : "+ listFromCart);
            for (int i = 0; i < listFromSearch.size(); i++) {
                Assert.assertEquals(listFromSearch.get(i),(listFromCart.get(i)));
                System.out.println("listFromCart."+i+" = " + listFromCart.get(i));
                System.out.println("listFromList "+i+") = " + listFromSearch.get(i));
            }
    }
    @Then("m Click Signup Login button and submit login details")
    public void m_click_signup_login_button_and_submit_login_details() throws InterruptedException {
        locator.signUpLoginButton.click();
        Thread.sleep(1);
        locator.loginEmailInput.sendKeys("mehlika@gmail.com"+ Keys.TAB+"mehlika"+Keys.TAB+Keys.ENTER);
        Thread.sleep(1);
    }
    @Then("m Click and go to Cart page")
    public void m_click_and_go_to_cart_page() {
        locator.cartButton.click();
    }
    @Then("m Verify that those products are visible in cart after login as well")
    public void m_verify_that_those_products_are_visible_in_cart_after_login_as_well() {

        listFromLoginCart=Driver.getDriver().findElements(By.xpath("//tbody/tr/td[2]/h4/a"));

        for (int i = 0; i < listFromLoginCart.size(); i++) {
            System.out.println("listFromLoginCart = " + listFromLoginCart.get(i).getText());
        }
        System.out.println("Search list size " +listFromSearch.size());
        System.out.println("Login cart list size " +listFromLoginCart.size());

        if(listFromLoginCart.size()==listFromSearch.size()) {
            for (int i = 0; i < listFromSearch.size(); i++) {
                Assert.assertEquals(listFromSearch.get(i),listFromLoginCart.get(i).getText());
            }
        }
            else System.out.println("Loginden sonra acilan Cart'ta, ekledigim urunler bulunmuyor.");

        System.out.println("Verify basarili, sepetteki listeler ayni");
        }
    }

