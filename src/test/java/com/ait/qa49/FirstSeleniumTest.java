package com.ait.qa49;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class FirstSeleniumTest {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.navigate().to("https://ilcarro.web.app");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.navigate().to("https://www.google.com");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();


    }
@Test
    public void openGoogleTest() {
        System.out.println("Google opened!");
}
@AfterMethod(enabled = true)
    public void tearDown() {
        driver.close();
}

}
