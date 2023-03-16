package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import dev.failsafe.internal.util.Assert;
import utils.Driver;
import utils.ElementControl;

public class LoginPage {

    private WebElement userNameInput = Driver.getDriver().findElement(By.id("etUsername"));
    private WebElement passwordInput = Driver.getDriver().findElement(By.id("etPassword"));
    private WebElement confirmButton = Driver.getDriver().findElement(By.id("btnConfirm"));
    private WebElement messageArea = Driver.getDriver().findElement(By.id("tvTitle"));

    public LoginPage fillUsername(String value){
        ElementControl.sendText(userNameInput, value);
        return this;
    }

    public LoginPage fillPassword(String value){
        ElementControl.sendText(passwordInput, value);
        return this;
    }

    public MainPage clickConfirmButton(){
        ElementControl.clickElement(confirmButton);
        return new MainPage();
    }

    public boolean isErrorMessageShown(){

        return ElementControl.isElementVisible(messageArea) || ElementControl.getText(messageArea).equals("Вход в Alfa-Test");
    }


}
