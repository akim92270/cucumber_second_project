package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SmartBearWebOrdersPage {

    public SmartBearWebOrdersPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "#ctl00_menu>li")
    public List<WebElement> orderMenuLinks;

    @FindBy(css = ".CheckUncheck>a")
    public List<WebElement> checkUncheckLinks;

    @FindBy(id = "ctl00_MainContent_btnDelete")
    public WebElement deleteSelectedButton;

    @FindBy(id = "ctl00_MainContent_orderMessage")
    public WebElement orderMessageText;

    @FindBy(css = ".SampleTable")
    public WebElement table;

    @FindBy(css = "table[id='ctl00_MainContent_orderGrid'] tr:nth-child(2)")
    public List<WebElement> firstRowCheck;

    @FindBy(css = "#ctl00_MainContent_fmwOrder_InsertButton")
    public WebElement processButton;

    public void clickOnMenuLink(String order){
        for(WebElement link : orderMenuLinks){
            if(link.getText().equals(order)){
                link.click();
                break;
            }
        }
    }
}
