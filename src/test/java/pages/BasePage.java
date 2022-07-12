package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class BasePage {
    public BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    public void clickOnMenuItem(List<WebElement> items, String itemTexts){
        for(WebElement element: items){
            if(element.getText().equals(itemTexts)){
                element.click();
                break;
            }
        }
    }
}
