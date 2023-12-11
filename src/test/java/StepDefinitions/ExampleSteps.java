package StepDefinitions;

import PageObjectModels.ExampleLocators;
import Utilities.DriverManager;
import io.cucumber.java.en.*;
import org.openqa.selenium.interactions.Actions;

public class ExampleSteps {
    ExampleLocators locators = new ExampleLocators();

    Actions actions = new Actions(DriverManager.Driver());


    @Given("Navigate to website")
    public void navigateToWebsite() {
        DriverManager.Driver().navigate().to("https://www.paytr.com/");

        if (locators.acceptCookieButton.size() > 0) {
            locators.click(locators.acceptCookieButton.get(0));
        }
    }

    @When("Products sections control")
    public void Products_sections_control() throws InterruptedException {

        actions.moveToElement(locators.urunler).build().perform();


    }

    @Then("Online payment solutions check")
    public void Online_payment_solutions_check() {

        for (int i = 0; i < locators.onlineodemecozumleri.size(); i++) {
            locators.onlineodemecozumleri.get(i).isDisplayed();
        }

    }

    @Then("Physical payment solutions control")
    public void Physical_payment_solutions_control() {

        actions.moveToElement(locators.fizikselodemecozumleri).build().perform();
        for (int i = 0; i < locators.fizikselodemesecenekleri.size(); i++) {
            locators.fizikselodemesecenekleri.get(i).isDisplayed();
        }
    }


    @Then("Alternative payment solutions check")
    public void Alternative_payment_solutions_check() {

        actions.moveToElement(locators.alternatifodemecozumleri).build().perform();
        for (int i = 0; i < locators.alternatifodemesecenekleri.size(); i++) {
            locators.alternatifodemesecenekleri.get(i).isDisplayed();

        }

    }


}
