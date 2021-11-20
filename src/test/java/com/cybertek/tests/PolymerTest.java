package com.cybertek.tests;

import com.cybertek.utils.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PolymerTest {
   public static WebDriver driver;
    public static void main(String[] args) {
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        String url="http://todomvc.com/";
        driver.get(url);

       // WebElement tabLink=driver.findElement(By.xpath("//div[.='JavaScript']"));
      //  tabLink.click();
        getTab("JavaScript").click();
       // WebElement link= driver.findElement(By.linkText("Polymer"));
       // link.click();
        getLink("Polymer").click();
        WebElement addBox=driver.findElement(By.id("new-todo"));
        String toDoItemOne="Office Hours for B24";
        addBox.sendKeys(toDoItemOne+ Keys.ENTER);
        String locatorForAddedItem="//label[.='"+toDoItemOne+"']";
        System.out.println("driver.findElement(By.xpath(locatorForAddedItem)).isDisplayed() = "
                + driver.findElement(By.xpath(locatorForAddedItem)).isDisplayed());
        driver.close();

    }
    public static WebElement getTab(String tab){
        String locator="//div[.='"+tab+"']";
        return driver.findElement(By.xpath(locator));
    }
    public static WebElement getLink(String link){
        return driver.findElement(By. linkText(link));
    }
}
