package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SmartBearOrderPage {

    public SmartBearOrderPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#ctl00_MainContent_fmwOrder_ddlProduct")
    public WebElement listOfProduct;

    @FindBy(css = "input[name$='Quantity']")
    public WebElement quantity;

    @FindBy(css = "input[name$='UnitPrice']")
    public WebElement unitPrice;

    @FindBy(css = "input[name$='Discount']")
    public WebElement discount;

    @FindBy(css = "input[name$='Total']")
    public WebElement total;

    @FindBy(css = "input[value='Calculate']")
    public WebElement calculate;

    @FindBy(css = "ol:nth-child(5) input")
    public List<WebElement> listOfAddressInfoInputBox;

    @FindBy(css = "ol input:nth-child(1)")
    public List<WebElement> listOfCardPayment;

    @FindBy(css = "#ctl00_MainContent_fmwOrder_TextBox6")
    public WebElement cardNumberInputBox;

    @FindBy(css = "#ctl00_MainContent_fmwOrder_TextBox1")
    public WebElement expiryDateInputBox;
}
