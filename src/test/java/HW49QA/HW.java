package HW49QA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HW {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://demowebshop.tricentis.com/");
    }
    @Test
    public void tearDown() {
        System.out.println("Demo Web Shop opened");
    }

    @Test
    public void findElementBySimpleLocators() {
        driver.findElement(By.className("header-logo"));
        driver.findElement(By.id("small-searchterms"));
        driver.findElement(By.id("topcartlink"));
        driver.findElement(By.className("search-box-button"));
        driver.findElement(By.className("ico-login"));
        driver.findElement(By.className("ico-register"));
        driver.findElement(By.linkText("Register"));
        driver.findElement(By.tagName("a"));
        driver.findElement(By.name("q"));
        driver.findElement(By.partialLinkText("Log"));

    }
    @Test
    public void findElementByCssSelectorTest() {
        driver.findElement(By.cssSelector("#topcartlink"));
        driver.findElement(By.cssSelector("#small-searchterms"));
        driver.findElement(By.cssSelector(".header-logo"));
        driver.findElement(By.cssSelector(".search-box-button"));
        driver.findElement(By.cssSelector(".ico-login"));
        driver.findElement(By.cssSelector(".ico-register"));
        driver.findElement(By.cssSelector("[href='/register']"));
        driver.findElement(By.cssSelector("[href*='digital']"));
        driver.findElement(By.cssSelector("[href^='/electro']"));
        driver.findElement(By.cssSelector("[href$='shoes']"));

    }
    @Test
    public void findElementByXpath() {
        driver.findElement(By.xpath("//input[@id='small-searchterms']"));
        driver.findElement(By.xpath("//a"));
        driver.findElement(By.xpath("//div[@class='header-logo']"));
        driver.findElement(By.xpath("//div[@class='header-menu']"));
        driver.findElement(By.xpath("//div[@class='header-links-wrapper']"));
        driver.findElement(By.xpath("//div[@class='header-links']"));
        driver.findElement(By.xpath("//a[@href='/jewelry']"));
        driver.findElement(By.xpath("//a[@href='/digital-downloads']"));
        driver.findElement(By.xpath("//a[@href='/apparel-shoes']"));
        driver.findElement(By.xpath("//a[@href='/electronics']"));
        driver.findElement(By.xpath("//input[@value='Search']"));
        driver.findElement(By.xpath("//a/.."));
        driver.findElement(By.xpath("//a/parent::*"));
        driver.findElement(By.xpath("//a/parent::div"));
        driver.findElement(By.xpath("//a[contains(.,'Log')]"));


    }

}
