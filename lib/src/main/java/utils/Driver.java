package utils;

import org.checkerframework.checker.nullness.qual.NonNull;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.android.AndroidDriver;

public class Driver {

    private static AndroidDriver driver;

    private Driver(){}

    public static AndroidDriver getDriver(){
        if(driver == null){
            URL appiumUrl = null;
            try {
                appiumUrl = new URL("http://127.0.0.1:4723/wd/hub");
            } catch (MalformedURLException e) {
                throw new RuntimeException(e);
            }
            DesiredCapabilities cap = new DesiredCapabilities();
            cap.setCapability("app", "D://alpha//app//app-debug.apk");
            cap.setCapability("platformName", "Android");
            cap.setCapability("platformVersion", "11.0");
            cap.setCapability("deviceName", "Android Emulator");
            driver = new AndroidDriver(appiumUrl,cap);
        }
        return driver;
    }

    public static void close() {
        getDriver().close();
    }
}
