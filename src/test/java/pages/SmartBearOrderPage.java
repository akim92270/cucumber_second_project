package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class SmartBearOrderPage extends BasePage {

    public SmartBearOrderPage() {
        super();
    }

    @FindBy(css = "#ctl00_MainContent_fmwOrder_ddlProduct")
    public WebElement listOfProduct;

    @FindBy(id = "ctl00_MainContent_fmwOrder_txtQuantity")
    public WebElement quantityInputBox;

    @FindBy(id = "ctl00_MainContent_fmwOrder_txtName")
    public WebElement customerNameInputBox;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox2")
    public WebElement streetInputBox;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox3")
    public WebElement cityInputBox;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox4")
    public WebElement stateInputBox;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox5")
    public WebElement zipInputBox;

    @FindBy(css = "input[id^='ctl00_MainContent_fmwOrder_cardList_']")
    public List<WebElement> paymentTypeInputLabels;

    @FindBy(css = "#ctl00_MainContent_fmwOrder_TextBox6")
    public WebElement cardNumberInputBox;

    @FindBy(css = "#ctl00_MainContent_fmwOrder_TextBox1")
    public WebElement expiryDateInputBox;

    public void selectPaymentType(String paymentType){
        for(WebElement element : paymentTypeInputLabels){
            if(element.getText().equals(paymentType)){
                element.click();
                break;
            }
        }
    }
}
