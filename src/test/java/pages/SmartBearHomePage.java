package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SmartBearHomePage {
    public SmartBearHomePage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "#ctl00_MainContent_username")
    public WebElement usernameInputBox;

    @FindBy(css = "#ctl00_MainContent_password")
    public WebElement passwordInputBox;

    @FindBy(css = "#ctl00_MainContent_login_button")
    public WebElement loginButton;

    @FindBy(css = ".error")
    public WebElement errorMessage;
}
