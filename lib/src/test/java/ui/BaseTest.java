package ui;

import org.testng.annotations.AfterTest;

import utils.Driver;

public class BaseTest {

    @AfterTest
    public void closeApp(){
        Driver.getDriver().close();
    }
}
