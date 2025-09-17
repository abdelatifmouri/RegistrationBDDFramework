package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.ConfigReader;

public class MainPage extends BasePage {
    public MainPage(WebDriver driver) {
        super(driver);
    }

    /// locating all WebElements from the main page

    @FindBy(id = "email")
    private WebElement emailField;

    @FindBy(id = "psw")
    private WebElement passwordField;

    @FindBy(id = "psw-repeat")
    private WebElement passwordRepeatField;

    @FindBy(xpath = "//button[@class='registerbtn']")
    private WebElement registerButton;


    //creating action methods for them
    public  void provideEmail() {
        emailField.sendKeys(ConfigReader.getPropertiesValue("email"));
    }

    public  void providePassword() {
        passwordField.sendKeys(ConfigReader.getPropertiesValue("password"));
    }

    public  void provideRepeatPassword() {
        passwordRepeatField.sendKeys(ConfigReader.getPropertiesValue("password"));
    }
    public void clickRegisterButton(){
        registerButton.click();
    }

}
