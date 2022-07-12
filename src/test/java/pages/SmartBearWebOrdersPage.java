package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SmartBearWebOrdersPage extends BasePage{

    public SmartBearWebOrdersPage(){
        super();
    }

    @FindBy(css = "#ctl00_menu>a")
    public List<WebElement> webOrdersMenuItems;

    @FindBy(css = ".CheckUncheck>a")
    public List<WebElement> checkUncheckLinks;

    @FindBy(id = "ctl00_MainContent_btnDelete")
    public WebElement deleteSelectedButton;

    @FindBy(id = "ctl00_MainContent_orderMessage")
    public WebElement orderMessageText;

    @FindBy(css = ".SampleTable")
    public WebElement table;

    @FindBy(css = "input[id*='ctl00_MainContent_orderGrid_ctl']")
    public List<WebElement> checkboxes;

    @FindBy(css = "#ctl00_MainContent_fmwOrder_InsertButton")
    public WebElement processButton;
}
