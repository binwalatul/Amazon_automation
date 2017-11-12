package amazon_automation;

import common.driver_factory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class browse_category extends driver_factory {
    public static void main(String[] args){
        String URL="https://www.amazon.in/";
        browser();
        ChromeDriver driver = new ChromeDriver();
        driver.get(URL);
        WebElement element=driver.findElementByCssSelector("#nav-shop .nav-line-2");
//        WebElement element =driver.findElementByCssSelector(".nav-template.nav-flyout-content.nav-tpl-itemList span:nth-child(6)");
        Actions action= new Actions(driver);
        action.moveToElement(element).moveToElement(driver.findElement(By.cssSelector(".nav-template.nav-flyout-content.nav-tpl-itemList span:nth-child(6)"))).click().build().perform();

        }
    }