package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.Driver;
import utils.ElementControl;

public class MainPage {

    private WebElement textArea = Driver.getDriver().findElement(By.id("nav_host_fragment_content_main"));

    public boolean isSuccessMessageShown(){
        return ElementControl.isElementVisible(textArea);
    }

}
