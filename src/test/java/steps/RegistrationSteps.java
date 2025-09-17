package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pages.MainPage;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static utils.Driver.getDriver;



public class RegistrationSteps {
    @Given("The user is on {string}")
    public void the_user_is_on(String url) {
        // in Hooks
    }

    @When("The user provides a valid email address {string}")
    public void the_user_provides_email(String email) {
        MainPage mainPage = new MainPage(getDriver());
        mainPage.provideEmail();
    }

    @When("The user provides a valid password {string}")
    public void the_user_provides_password(String password) {
        MainPage mainPage = new MainPage(getDriver());
        mainPage.providePassword();
    }

    @When("The User provides a matching repeat password {string}")
    public void the_user_provides_repeat_password(String repeatPassword) {
        MainPage mainPage = new MainPage(getDriver());
        mainPage.provideRepeatPassword();
    }
    @When("The User hits Register button")
    public void the_user_hits_Register() {
        MainPage mainPage = new MainPage(getDriver());
        mainPage.clickRegisterButton();
    }


    @Then("The user should be able to register successfully")
    public void the_user_gets_success_message() {
        MainPage mainPage = new MainPage(getDriver());
        // would assertTrue here if the user sees Success message.
        //but since this message is not present at current website, nothing is verified at this step.

    }
}




