package utils;

import org.openqa.selenium.WebElement;

import java.time.Duration;

import io.appium.java_client.AppiumFluentWait;
import io.appium.java_client.touch.WaitOptions;

public class ElementControl {

    private ElementControl(){}

    public static void clickElement(WebElement element){
       element.click();
    }

    public static void sendText(WebElement element, String text){
        element.sendKeys(text);
    }

    public static boolean isElementVisible(WebElement element) {
        waitForSec(5);
        return element.isDisplayed();
    }

    public static String getText(WebElement messageArea) {
        waitForSec(5);
        return messageArea.getText();
    }

    private static void waitForSec(int seconds){
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
